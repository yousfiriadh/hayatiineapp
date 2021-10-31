package com.yousfi.hayatiineApp.ui.fragment.notification

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.ViewModel
import com.yousfi.hayatiine.ui.base.BaseViewModel
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.data.entities.Favoris
import com.yousfi.hayatiineApp.data.entities.Notification

class NotificationViewModel : BaseViewModel<NotificationNavigator> (){
    var listNotification = ObservableArrayList<Notification>()


    init {
        listNotification.add(Notification("Sara", R.drawable.personne,"Votre article est confirmé","iL y a 2j"))
        listNotification.add(Notification("Wafa", R.drawable.personne,"Votre article est confirmé","iL y a 2j"))
        listNotification.add(Notification("Safa", R.drawable.personne,"Votre article est confirmé","iL y a 2j"))
        listNotification.add(Notification("Mariem", R.drawable.personne,"Votre article est confirmé","iL y a 2j"))
        listNotification.add(Notification("Safa", R.drawable.personne,"Votre article est confirmé","iL y a 2j"))
        listNotification.add(Notification("Safa", R.drawable.personne,"Votre article est confirmé","iL y a 2j"))
        listNotification.add(Notification("Safa", R.drawable.personne,"Votre article est confirmé","iL y a 2j"))
        listNotification.add(Notification("Sara", R.drawable.personne,"Votre article est confirmé","iL y a 5s"))
        listNotification.add(Notification("wafa", R.drawable.personne,"Votre article est confirmé","iL y a 7j"))
        listNotification.add(Notification("Kenza", R.drawable.personne,"Votre article est confirmé","iL y a 7j"))

    }
}