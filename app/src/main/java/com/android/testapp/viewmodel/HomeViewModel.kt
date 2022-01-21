package com.android.testapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.testapp.data.repository.DataRepository
import com.android.testapp.model.ArticleBody
import com.android.testapp.model.ArticleHolder
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import retrofit2.Response
import java.net.HttpURLConnection
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    val dataRepository: DataRepository
) : ViewModel() {
    private var compositeDisposable: CompositeDisposable? = CompositeDisposable()
    private var repoLoading: MutableLiveData<Boolean> = MutableLiveData()
    private var repoLoadError: MutableLiveData<String> = MutableLiveData()
    private var articlesMutable: MutableLiveData<List<ArticleBody>> = MutableLiveData()

    fun getError(): LiveData<String> {
        return repoLoadError
    }

    fun getLoading(): LiveData<Boolean> {
        return repoLoading
    }

    fun getArticlesObserver(): LiveData<List<ArticleBody>> {
        return articlesMutable
    }

    fun getArticles() {
        repoLoading.value = true
        compositeDisposable?.add(
            dataRepository.getArticles()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<Response<ArticleHolder>>() {
                    override fun onSuccess(response: Response<ArticleHolder>?) {
                        if (response != null && response.code() == HttpURLConnection.HTTP_OK && response.body()?.status == "ok") {
                            articlesMutable.value = response.body()?.articles
                        } else {
                            repoLoadError.value = response!!.message()
                        }
                        repoLoading.value = false
                    }

                    override fun onError(e: Throwable?) {
                        repoLoadError.value = e!!.message
                        repoLoading.value = false
                    }
                })
        )
    }

    public override fun onCleared() {
        compositeDisposable?.dispose()
        super.onCleared()
    }

}