package com.test.moviehub.component.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.paging.CombinedLoadStates
import androidx.paging.LoadState
import androidx.recyclerview.widget.GridLayoutManager
import com.test.moviehub.R
import com.test.moviehub.component.adapters.SearchResultsAdapter
import com.test.moviehub.component.dialogs.LoadingDialog
import com.test.moviehub.component.viewModels.SearchFragmentVM
import com.test.moviehub.databinding.FragmentSearchBinding
import com.test.moviehub.component.viewModels.GetDetailsVM
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class SearchFragment : Fragment(R.layout.fragment_search), SearchView.OnQueryTextListener,
        (CombinedLoadStates) -> Unit, SearchResultsAdapter.ItemListOnClickListener {

    lateinit var binding: FragmentSearchBinding

    @Inject
    lateinit var loadingDialog: LoadingDialog

    @Inject
    lateinit var searchResultsAdapter: SearchResultsAdapter
    private val searchFragmentVM: SearchFragmentVM by viewModels()
    private val getDetailsVM: GetDetailsVM by viewModels()
    private var mJob: Job? = null
    private var isClicked = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_search, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        parseView()
        registerObserver()
    }

    private fun registerObserver() {
        getDetailsVM.movie.observe(viewLifecycleOwner, {
            if (isClicked) {
                isClicked = false
                loadingDialog.hide()
                findNavController().navigate(
                    SearchFragmentDirections.actionFragmentMainToFragmentDetail(
                        it, it.title
                    )
                )
            }
        })
        getDetailsVM.error.observe(viewLifecycleOwner, {
            isClicked = false
            loadingDialog.hide()
            Toast.makeText(requireContext(), it.message, Toast.LENGTH_SHORT).show()
        })
    }

    private fun parseView() {
        binding.rv.apply {
            layoutManager = GridLayoutManager(requireContext(), 2)
            setHasFixedSize(true)
            adapter = searchResultsAdapter
        }
        searchResultsAdapter.addLoadStateListener(this)
        searchResultsAdapter.setOnClickListener(this)
        search()
        binding.sv.setOnQueryTextListener(this)
    }

    private fun search(query: String? = null) {
        mJob?.cancel()
        mJob = lifecycleScope.launch {
            if (query == null)
                searchFragmentVM.getPopularMovies().collectLatest {
                    binding.textTop = getString(R.string.popular)
                    searchResultsAdapter.submitData(it)
                }
            else
                searchFragmentVM.searchMovies(query).collectLatest {
                    binding.textTop = "Movies including $query"
                    searchResultsAdapter.submitData(it)
                }
        }
    }

    override fun onQueryTextSubmit(p0: String?): Boolean {
        if (!p0.isNullOrEmpty())
            search(p0)
        binding.sv.setQuery("", false)
        binding.root.requestFocus()
        return false
    }

    override fun onQueryTextChange(p0: String?): Boolean {
        return false
    }

    override fun invoke(loadState: CombinedLoadStates) {
        if (loadState.refresh is LoadState.Loading ||
            loadState.append is LoadState.Loading
        )
            loadingDialog.show()
        else {
            loadingDialog.hide()

            // If we have an error, show a toast
            val errorState = when {
                loadState.append is LoadState.Error -> loadState.append as LoadState.Error
                loadState.prepend is LoadState.Error -> loadState.prepend as LoadState.Error
                loadState.refresh is LoadState.Error -> loadState.refresh as LoadState.Error
                else -> null
            }
            if (loadState.refresh is LoadState.Error || (loadState.append.endOfPaginationReached &&
                        searchResultsAdapter.itemCount == 0)
            )
                binding.txtNoData.visibility = View.VISIBLE
            else
                binding.txtNoData.visibility = View.GONE
            errorState?.let {
                Toast.makeText(requireContext(), it.error.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onClick(id: Int) {
        isClicked = true
        getDetailsVM.getDetails(id)
        loadingDialog.show()
    }
}