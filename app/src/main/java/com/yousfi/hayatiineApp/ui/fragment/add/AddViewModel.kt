package com.yousfi.hayatiineApp.ui.fragment.add

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.ViewModel
import com.yousfi.hayatiine.ui.base.BaseViewModel
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.data.entities.Category
import com.yousfi.hayatiineApp.data.entities.Favoris
import com.yousfi.hayatiineApp.data.entities.SubCategory

class AddViewModel : BaseViewModel<AddNavigator>() {
    var listCategory = ObservableArrayList<Category>()
    var listsubCategory = ObservableArrayList<SubCategory>()

    init {
        listCategory.add(Category("Vétement",true))
        listCategory.add(Category("Chaussures",false))
        listCategory.add(Category("Sac",false))
        listCategory.add(Category("Accessoires",false))
        listCategory.add(Category("Robes",false))


        listsubCategory.add(SubCategory("Robes",R.drawable.item_2))
        listsubCategory.add(SubCategory("koftan",R.drawable.item_2))
        listsubCategory.add(SubCategory("Jupe",R.drawable.trace_4))
        listsubCategory.add(SubCategory("Pule",R.drawable.trace_3))
        listsubCategory.add(SubCategory("Shorte",R.drawable.trace_2))
        listsubCategory.add(SubCategory("Pants",R.drawable.trace_1))
        listsubCategory.add(SubCategory("Chemise",R.drawable.item_3))
        listsubCategory.add(SubCategory("Socks",R.drawable.item_4))

    }



}