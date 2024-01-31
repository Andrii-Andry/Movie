package com.brunoext.movie.list


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.brunoext.movie.R
import com.bumptech.glide.Glide


class PersonAdapter: RecyclerView.Adapter<MovieViewHolder>() {

    private val movieList = mutableListOf<MovieInfo>()

    fun addMovie(movieInfo: List<MovieInfo>){
        movieList.addAll(movieInfo)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemView: View=
            LayoutInflater.
            from(parent.context).
            inflate (R.layout.movie_card, parent, false)
        return MovieViewHolder(itemView)
    }

    override fun getItemCount(): Int {
       return movieList.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movieList[position])



    }

}