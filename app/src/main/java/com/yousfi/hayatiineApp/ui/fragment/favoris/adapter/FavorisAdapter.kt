package com.yousfi.hayatiineApp.ui.fragment.favoris.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ObservableArrayList
import com.yousfi.hayatiine.ui.base.BaseViewHolder
import com.yousfi.hayatiineApp.data.entities.Favoris
import com.yousfi.hayatiineApp.databinding.ListItemFavorisBinding
import com.yousfi.hayatiineApp.ui.base.ObservableRecyclerViewAdapter
import com.yousfi.hayatiineApp.ui.fragment.favoris.FavorisViewModel


class FavorisAdapter(
    var viewModel: FavorisViewModel,var list: ObservableArrayList<Favoris>
) : ObservableRecyclerViewAdapter<Favoris, BaseViewHolder<Favoris>>(
    list
) {
    private val TAG = "FavorisAdapter"
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): BaseViewHolder<Favoris> {
        return Holder(
            ListItemFavorisBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Favoris>, position: Int) {
        holder.bind(list[position])
    }

    inner class Holder(private val binding: ListItemFavorisBinding) :
        BaseViewHolder<Favoris>(binding.root) {
        override fun bind(items: Favoris) {
            binding.item=items
            binding.actionButton1.setOnClickListener{

            }
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
