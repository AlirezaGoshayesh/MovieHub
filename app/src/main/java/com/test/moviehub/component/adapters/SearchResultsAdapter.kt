package com.test.moviehub.component.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.test.moviehub.R
import com.test.moviehub.data.model.MovieResult
import com.test.moviehub.databinding.ItemMoviewBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.item_moview.view.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SearchResultsAdapter @Inject constructor() :
    PagingDataAdapter<MovieResult, SearchResultsAdapter.MovieResultViewHolder>(
        SearchResultsComparator
    ) {

    private var onClickListener: ItemListOnClickListener? = null

    interface ItemListOnClickListener {
        fun onClick(id: Int)
    }

    fun setOnClickListener(onClickListener: ItemListOnClickListener) {
        this.onClickListener = onClickListener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieResultViewHolder {
        return MovieResultViewHolder(
            ItemMoviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }


    override fun onBindViewHolder(holder: MovieResultViewHolder, position: Int) {
        val item = getItem(position)
        item?.let { holder.bindMovie(it) }
    }

    inner class MovieResultViewHolder(private val binding: ItemMoviewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bindMovie(item: MovieResult) {
            binding.apply {
                movie = item
                root.setOnClickListener {
                    onClickListener?.onClick(id = item.id)
                }
            }
        }
    }

    object SearchResultsComparator : DiffUtil.ItemCallback<MovieResult>() {
        override fun areItemsTheSame(oldItem: MovieResult, newItem: MovieResult): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: MovieResult, newItem: MovieResult): Boolean {
            return oldItem == newItem
        }
    }
}

@BindingAdapter("image")
fun setImage(image: ImageView, imageUrl: String?) {
    if (!imageUrl.isNullOrEmpty()) {
        Glide.with(image.context).load(image.context.getString(R.string.image_base_url) + imageUrl)
            .error(R.drawable.ic_place)
            .into(image)
    }
}