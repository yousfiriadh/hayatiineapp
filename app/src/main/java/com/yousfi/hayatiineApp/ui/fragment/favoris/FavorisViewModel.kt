package com.yousfi.hayatiineApp.ui.fragment.favoris

import androidx.databinding.ObservableArrayList
import com.yousfi.hayatiine.ui.base.BaseViewModel
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.data.entities.Favoris

class FavorisViewModel : BaseViewModel<FavorisNavigator>(){
    var listFavori = ObservableArrayList<Favoris>()


    init {
        listFavori.add(Favoris("Pantalon","100",R.drawable.images2))
        listFavori.add(Favoris("shirt","100",R.drawable.image1))
        listFavori.add(Favoris("Chaussure","200",R.drawable.images2))
        listFavori.add(Favoris("Pantalon","120",R.drawable.images2))
        listFavori.add(Favoris("shirt","100",R.drawable.image1))
        listFavori.add(Favoris("Chaussure","200",R.drawable.images2))
        listFavori.add(Favoris("Pantalon","120",R.drawable.images2))
        listFavori.add(Favoris("shirt","100",R.drawable.image1))
        listFavori.add(Favoris("Chaussure","200",R.drawable.images2))
        listFavori.add(Favoris("Pantalon","120",R.drawable.images2))

    }
}