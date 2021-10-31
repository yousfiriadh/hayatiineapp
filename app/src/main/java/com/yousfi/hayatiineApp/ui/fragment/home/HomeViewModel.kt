package com.yousfi.hayatiineApp.ui.fragment.home

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.ViewModel
import com.yousfi.hayatiine.ui.base.BaseViewModel
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.data.entities.Article
import com.yousfi.hayatiineApp.data.entities.ListImage

class HomeViewModel :BaseViewModel<HomeNavigator>() {
    var listArticle = ObservableArrayList<Article>()



    init {
        listArticle.add(Article("Pantalon","100",R.drawable.images2))
        listArticle.add(Article("shirt","100",R.drawable.image1))
        listArticle.add(Article("Chaussure","200",R.drawable.images2))
        listArticle.add(Article("Pantalon","120",R.drawable.images2))
        listArticle.add(Article("Pantalon","120",R.drawable.images2))
        listArticle.add(Article("Pantalon","111",R.drawable.images2))
        listArticle.add(Article("Pantalon","124",R.drawable.images2))

    }


}