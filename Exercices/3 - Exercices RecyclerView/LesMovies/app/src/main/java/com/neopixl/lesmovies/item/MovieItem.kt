package com.neopixl.lesmovies.item

import android.util.Log
import android.view.View
import com.mikepenz.fastadapter.items.AbstractItem
import com.neopixl.lesmovies.Movie
import com.neopixl.lesmovies.R
import com.neopixl.lesmovies.viewholder.MovieViewHolder

/**
 * Created by Yvan Moté on 2019-10-17.
 */
class MovieItem(val movie: Movie): AbstractItem<MovieViewHolder>() {
    override val layoutRes: Int
        get() = R.layout.row_movie
    override val type: Int
        get() = R.id.movieTitleTextView

    override fun getViewHolder(v: View): MovieViewHolder {
        return MovieViewHolder(v)
    }
}