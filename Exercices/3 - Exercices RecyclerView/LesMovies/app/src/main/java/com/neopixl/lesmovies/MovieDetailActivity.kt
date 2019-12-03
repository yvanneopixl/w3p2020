package com.neopixl.lesmovies

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_movie_detail.*

class MovieDetailActivity : AppCompatActivity() {

    companion object {
        val movie_extra = "movie_extra"

        fun createIntent(context: Context, movie: Movie): Intent {
            val intent = Intent(context, MovieDetailActivity::class.java)
            intent.putExtra(movie_extra, movie)

            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val movie = intent.getParcelableExtra<Movie>(movie_extra)

        title = movie.title
        releaseYearDetailTextView.text = movie.releaseYear.toString()
        synopsisDetailTextView.text = movie.synopsis
    }
}
