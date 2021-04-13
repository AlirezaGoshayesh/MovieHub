package com.test.moviehub.component.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.test.moviehub.R
import com.test.moviehub.data.model.MovieResult
import kotlinx.android.synthetic.main.item_moview.view.*

class SearchResultsAdapter :
    PagingDataAdapter<MovieResult, SearchResultsAdapter.MovieResultViewHolder>(PassengersComparator) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieResultViewHolder {
        return MovieResultViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_moview, parent, false)
        )
    }


    override fun onBindViewHolder(holder: MovieResultViewHolder, position: Int) {
        val item = getItem(position)
        item?.let { holder.bindPassenger(it) }
    }

    inner class MovieResultViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        @SuppressLint("SetTextI18n")
        fun bindPassenger(item: MovieResult) {
            itemView.text.text = item.title
        }
    }

    object PassengersComparator : DiffUtil.ItemCallback<MovieResult>() {
        override fun areItemsTheSame(oldItem: MovieResult, newItem: MovieResult): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: MovieResult, newItem: MovieResult): Boolean {
            return oldItem == newItem
        }
    }
}