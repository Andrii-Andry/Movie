package com.brunoext.movie.list


import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.brunoext.movie.R
import com.bumptech.glide.Glide
import com.github.javafaker.Avatar



class MovieViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind(movieInfo: MovieInfo){
        val imageBanner = itemView.findViewById<ImageView>(R.id.imageBanner)
        val ageRestriction = itemView.findViewById<TextView>(R.id.ageRestriction)
        val genre = itemView.findViewById<TextView>(R.id.genre)
        val movieName = itemView.findViewById<TextView>(R.id.movieName)
        movieName.text = movieInfo.name
        genre.text = movieInfo.genre
        ageRestriction.text = movieInfo.age.toString()


        }
    }









