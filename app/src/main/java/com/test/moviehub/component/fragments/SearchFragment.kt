package com.test.moviehub.component.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.test.moviehub.R
import com.test.moviehub.component.adapters.SearchResultsAdapter
import com.test.moviehub.component.viewModels.SearchMoviesVM
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_search.*
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class SearchFragment : Fragment(R.layout.fragment_search) {

    @Inject
    lateinit var searchResultsAdapter: SearchResultsAdapter
    private val searchMoviesVM: SearchMoviesVM by viewModels()
    private var searchJob: Job? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        parseView()
    }

    private fun parseView() {
        rv.layoutManager = GridLayoutManager(requireContext(), 2)
        rv.setHasFixedSize(true)
        rv.adapter = searchResultsAdapter
        searchJob = lifecycleScope.launch {
            searchMoviesVM.searchMovies("jack").collectLatest {
                searchResultsAdapter.submitData(it)
            }
        }
    }
}