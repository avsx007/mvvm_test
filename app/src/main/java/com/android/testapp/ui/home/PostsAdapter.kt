package com.android.testapp.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.android.testapp.R
import com.android.testapp.model.ArticleBody

class PostsAdapter(
    var articles: ArrayList<ArticleBody>,
    val mContext: Context
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val VIEW_TYPE_DEFAULT = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            else -> {
                return PostViewHolder(
                    LayoutInflater.from(mContext).inflate(
                        R.layout.item_article,
                        parent,
                        false
                    )
                )
            }
        }
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    override fun getItemViewType(position: Int): Int {
        return VIEW_TYPE_DEFAULT
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (getItemViewType(position)) {
            VIEW_TYPE_DEFAULT -> {
                (holder as PostViewHolder).loadData()
            }
        }
    }

    fun swapData(articles: List<ArticleBody>) {
        this.articles = ArrayList(articles)
        notifyDataSetChanged()
    }

    inner class PostViewHolder(view: View) : RecyclerView.ViewHolder(view){

        var ivArticle:ImageView = view.findViewById(R.id.ivArticle)
        var tvTitle:TextView = view.findViewById(R.id.tvTitle)
        fun loadData() {
            Glide.with(mContext).load(articles[adapterPosition].urlToImage).into(ivArticle)
            tvTitle.text = articles[adapterPosition].title
        }

    }
}