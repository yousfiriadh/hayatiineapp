package com.yousfi.hayatiineApp.ui.fragment.notification.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ObservableArrayList
import com.yousfi.hayatiine.ui.base.BaseViewHolder
import com.yousfi.hayatiineApp.data.entities.Notification
import com.yousfi.hayatiineApp.databinding.ListItemNotificationBinding
import com.yousfi.hayatiineApp.ui.base.ObservableRecyclerViewAdapter
import com.yousfi.hayatiineApp.ui.fragment.notification.NotificationViewModel


class NotificationAdapter(
    var viewModel: NotificationViewModel,var list: ObservableArrayList<Notification>
) : ObservableRecyclerViewAdapter<Notification, BaseViewHolder<Notification>>(
    list
) {
    private val TAG = "FavorisAdapter"
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): BaseViewHolder<Notification> {
        return Holder(
            ListItemNotificationBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Notification>, position: Int) {
        holder.bind(list[position])
    }

    inner class Holder(private val binding: ListItemNotificationBinding) :
        BaseViewHolder<Notification>(binding.root) {
        override fun bind(items: Notification) {
            binding.item=items
        //    binding.actionButton1.setOnClickListener{

      //      }
//            binding.isDefaultCardRadioButton.isChecked = item.defaultCard
//            binding.creditCardNumberTextView.text = item.cardNumber
//            Glide
//                .with(binding.root.context)
//                .load(item.imageUrl)
////                .placeholder(R.drawable.loading_spinner)
//                .into(binding.cardType);
        }
    }
}
