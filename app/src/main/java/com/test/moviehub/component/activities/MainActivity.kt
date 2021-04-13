package com.test.moviehub.component.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import com.test.moviehub.R
import com.test.moviehub.component.viewModels.SearchMoviesVM
import com.vada.parents.component.viewModels.GetDetailsVM
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: SearchMoviesVM by viewModels()
    private val viewModel2: GetDetailsVM by viewModels()
    private var searchJob: Job? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startSearchJob()
        viewModel2.children.observe(this, {
            Log.d("sasdasdadasdasdasda", it.toString())
        })
    }

    private fun startSearchJob() {
        viewModel2.getDetails()
        searchJob?.cancel()
        searchJob = lifecycleScope.launch {
            viewModel.searchMovies("jack").collectLatest {
                Log.d("sdaadadsadasdasdas", it.toString())
            }
        }
    }
}