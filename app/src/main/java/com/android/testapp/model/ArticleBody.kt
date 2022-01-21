package com.android.testapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class ArticleBody (
    @SerializedName("title")
    @Expose
    var title: String? = null,

    @SerializedName("urlToImage")
    @Expose
    var urlToImage: String? = null
)
{
    /*@SerializedName("author")
    @Expose
    var author: String? = null

    @SerializedName("description")
    @Expose
    var description: String? = null

    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("publishedAt")
    @Expose
    var publishedAt: String? = null

    @SerializedName("content")
    @Expose
    var content: String? = null*/
}