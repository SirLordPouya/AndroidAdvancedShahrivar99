package com.sematec.android.advanced.shahrivar99

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sematec.android.advanced.shahrivar99.pojo.Search
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter : ListAdapter<Search, MovieAdapter.MovieViewHolder>(MovieDiffUtils()) {

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun onBind(item: Search) {
            itemView.txtMovieName.text = item.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return MovieViewHolder(v)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }
}

class MovieDiffUtils : DiffUtil.ItemCallback<Search>() {
    override fun areItemsTheSame(oldItem: Search, newItem: Search): Boolean {
        return oldItem.title == newItem.title && oldItem.imdbID == newItem.imdbID
    }

    override fun areContentsTheSame(oldItem: Search, newItem: Search): Boolean {
        return oldItem.title == newItem.title && oldItem.imdbID == newItem.imdbID
    }

}