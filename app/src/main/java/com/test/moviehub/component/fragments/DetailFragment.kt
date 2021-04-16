package com.test.moviehub.component.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.SearchView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.paging.CombinedLoadStates
import androidx.paging.LoadState
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.test.moviehub.R
import com.test.moviehub.component.activities.MainActivity
import com.test.moviehub.component.adapters.SearchResultsAdapter
import com.test.moviehub.component.dialogs.LoadingDialog
import com.test.moviehub.component.viewModels.SearchFragmentVM
import com.test.moviehub.databinding.FragmentDetailBinding
import com.test.moviehub.databinding.FragmentSearchBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject


@AndroidEntryPoint
class DetailFragment : Fragment(R.layout.fragment_detail) {

    lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_detail, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        parseView()
    }

    private fun parseView() {
        //binding data from navigation argument to view with dataBinding
        binding.apply {
            movie = DetailFragmentArgs.fromBundle(requireArguments()).movie
        }
    }

}