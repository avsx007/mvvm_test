package com.android.testapp.data.webservice

import com.android.testapp.model.*
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.*

interface RestService {

    @GET("everything?q=tesla&from=2021-12-21&sortBy=publishedAt&apiKey=fd78102346e84058b2e52185ca2c9606")
    fun getArticles(): Single<Response<ArticleHolder>>

  /*  @POST("GetCommentsReplies")
    fun getCommentsReplies(@Body requestBody: ListRequestBody): Single<Response<List<CommentBody>>>*/

}