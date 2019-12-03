package com.neopixl.lesmovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.IAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter
import com.neopixl.lesmovies.item.MovieItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(this)
        moviesRecyclerView.layoutManager = layoutManager

        val movies = ModelGenerator().allMovies

        val itemAdapter = ItemAdapter<MovieItem>()
        itemAdapter.add(movies.map { MovieItem((it)) })

        val fastAdapter = FastAdapter.with(itemAdapter)
        moviesRecyclerView.adapter = fastAdapter

        moviesRecyclerView.addItemDecoration(DividerItemDecoration(this, RecyclerView.VERTICAL))

        fastAdapter.onClickListener = { view: View?, iAdapter: IAdapter<MovieItem>, movieItem: MovieItem, i: Int ->

            val movie = movieItem.movie
            startActivity(MovieDetailActivity.createIntent(this, movie))

            true
        }
    }
}
