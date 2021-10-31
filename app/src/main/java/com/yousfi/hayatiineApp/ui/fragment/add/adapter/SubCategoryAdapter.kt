package com.yousfi.hayatiineApp.ui.fragment.add.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ObservableArrayList
import com.yousfi.hayatiine.ui.base.BaseViewHolder
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.data.entities.Category
import com.yousfi.hayatiineApp.data.entities.SubCategory
import com.yousfi.hayatiineApp.databinding.ItemCategoryBinding
import com.yousfi.hayatiineApp.databinding.ItemSubCategoryBinding
import com.yousfi.hayatiineApp.ui.base.ObservableRecyclerViewAdapter
import com.yousfi.hayatiineApp.ui.fragment.add.AddViewModel
import kotlinx.android.synthetic.main.item_category.view.*
import kotlinx.android.synthetic.main.item_sub_category.view.*


class SubCategoryAdapter  (
    var viewModel: AddViewModel, var list: ObservableArrayList<SubCategory>
) : ObservableRecyclerViewAdapter<SubCategory, BaseViewHolder<SubCategory>>(
    list
) {
    private var selectedPosition: Int = 0


    private val TAG = "CategoryAdapter"
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): BaseViewHolder<SubCategory> {
        return Holder(
            ItemSubCategoryBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: BaseViewHolder<SubCategory>, position: Int) {
        holder.bind(list[position])
        holder.itemView.apply {

            if (position % 3 == 0  ){

                layoutItemCat.setBackgroundColor(R.drawable.sub_category_item_background)
                tv_sub_cat.setTextColor(Color.parseColor("#212121"))
            } else {
                layoutItemCat.setBackgroundResource(R.drawable.sub_category_item_background2)
               tv_sub_cat.setTextColor(Color.parseColor("#FFFFFF"))
            }



        /*    onItemClickListener {
                onItemClickListener?.let { it(currentCategory.toString()) }

                if (selectedPosition >= 0) {
                    notifyItemChanged(selectedPosition)
                }
                selectedPosition = holder.adapterPosition
                notifyItemChanged(selectedPosition)
            }*/
        }

    }

    inner class Holder(private val binding: ItemSubCategoryBinding) :
        BaseViewHolder<SubCategory>(binding.root) {
        override fun bind(items: SubCategory) {
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

