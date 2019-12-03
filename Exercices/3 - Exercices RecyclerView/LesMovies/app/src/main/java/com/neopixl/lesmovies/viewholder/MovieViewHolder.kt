package com.neopixl.lesmovies.viewholder

import android.util.Log
import android.view.View
import com.mikepenz.fastadapter.FastAdapter
import com.neopixl.lesmovies.item.MovieItem
import kotlinx.android.synthetic.main.row_movie.view.*

/**
 * Created by Yvan Moté on 2019-10-17.
 */

class MovieViewHolder(itemView: View) : FastAdapter.ViewHolder<MovieItem>(itemView) {
    override fun bindView(item: MovieItem, payloads: MutableList<Any>) {
        val movie = item.movie

        itemView.movieTitleTextView.text = movie.title
        itemView.movieReleaseYearTextView.text = movie.releaseYear.toString()
    }

    override fun unbindView(item: MovieItem) {

        itemView.movieTitleTextView.text = null
        itemView.movieReleaseYearTextView.text = null
    }

}