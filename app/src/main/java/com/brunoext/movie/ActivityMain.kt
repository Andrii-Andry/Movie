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
                MovieInfo(name = "Scream", genre = "horror", avatarURL = "https://cdn.theatlantic.com/thumbor/hL7nw-hDmOt3yMZZ9TAwtj7o14g=/525x0:1931x1406/1080x1080/media/img/mt/2022/01/scr14979r_2/original.jpg", age = +16),
                MovieInfo(name = "Batman", genre = "action", avatarURL = "https://prod-printler-front-as.azurewebsites.net/media/photo/162551-1.jpg", age = +13),
                MovieInfo(name = "One Piece", genre = "anime", avatarURL = "https://static.tvtropes.org/pmwiki/pub/images/2e5c6d37_566f_4274_b62d_ebf5fcbd0722.png", age = +16),
                MovieInfo(name = "Max Payne", genre = "triller", avatarURL = "https://static.android.com.pl/uploads/2022/06/Max-Payne-2008.jpg", age = +18),

            )
        )

    }






}