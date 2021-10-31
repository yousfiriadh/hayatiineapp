package com.yousfi.hayatiineApp.ui.fragment.add.adapter


import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ObservableArrayList

import com.yousfi.hayatiineApp.data.entities.Category
import com.yousfi.hayatiine.ui.base.BaseViewHolder
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.databinding.ItemCategoryBinding
import com.yousfi.hayatiineApp.ui.base.ObservableRecyclerViewAdapter
import com.yousfi.hayatiineApp.ui.fragment.add.AddViewModel
import kotlinx.android.synthetic.main.item_category.view.*


class CategoryAdapter (
    var viewModel: AddViewModel, var list: ObservableArrayList<Category>
) : ObservableRecyclerViewAdapter<Category, BaseViewHolder<Category>>(
    list
) {
    private var selectedPosition: Int = 0


    private val TAG = "CategoryAdapter"
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): BaseViewHolder<Category> {
        return Holder(
            ItemCategoryBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Category>, position: Int) {
        holder.bind(list[position])

        holder.itemView.apply {
            if (selectedPosition == position) {
        //       constLayout.setBackgroundResource(R.drawable.category_item_background)
                tv_cat.setTextColor(Color.parseColor("#ffffff"))
                imageView.setBackgroundColor(Color.parseColor("#ff91a7"))
            } else {
                constLayout.setBackgroundResource(0)
                tv_cat.setTextColor(Color.parseColor("#AEACAC"))
            }

          /*  onItemClickListener {
                onItemClickListener?.let { it(currentCategory.toString()) }

                if (selectedPosition >= 0) {
                    notifyItemChanged(selectedPosition)
                }
                selectedPosition = holder.adapterPosition
                notifyItemChanged(selectedPosition)
            }*/
        }
    }

    inner class Holder(private val binding: ItemCategoryBinding) :
        BaseViewHolder<Category>(binding.root) {
        override fun bind(items: Category) {
            binding.item=items
         //   binding.actionButton1.setOnClickListener{

         //   }
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

