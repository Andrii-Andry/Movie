package com.brunoext.movie

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.widget.Adapter
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.brunoext.movie.databinding.ActyvityMainBinding
import com.brunoext.movie.list.MovieInfo
import com.brunoext.movie.list.PersonAdapter


class ActivityMain: AppCompatActivity(){
    private lateinit var personAdapter: PersonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val recyclerView = findViewById<RecyclerView>(R.id.movieInfo)
        initRecyclerView()
        recyclerView.adapter = personAdapter

    }


    private fun initRecyclerView() {
        personAdapter = PersonAdapter()
        personAdapter.addMovie(
            listOf(
                MovieInfo(name = "scream 5", genre = "horror", avatarURL = "", age = 190),
                MovieInfo(name = "scream 4", genre = "triller", avatarURL = "", age = +20),
                MovieInfo(name = "scream 4", genre = "triller", avatarURL = "", age = +20),
                MovieInfo(name = "scream 4", genre = "triller", avatarURL = "", age = +20),

            )
        )

    }






}