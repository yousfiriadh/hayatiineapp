package com.yousfi.hayatiineApp.dataBinding
import android.graphics.Rect
import android.view.View
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.*
import com.yousfi.hayatiineApp.ui.fragment.add.AddViewModel
import com.yousfi.hayatiineApp.ui.fragment.add.adapter.CategoryAdapter
import com.yousfi.hayatiineApp.ui.fragment.add.adapter.SubCategoryAdapter
import com.yousfi.hayatiineApp.ui.fragment.favoris.FavorisViewModel
import com.yousfi.hayatiineApp.ui.fragment.favoris.adapter.FavorisAdapter
import com.yousfi.hayatiineApp.ui.fragment.home.HomeViewModel
import com.yousfi.hayatiineApp.ui.fragment.home.adapter.ArticleInMainAdapter
import com.yousfi.hayatiineApp.ui.fragment.notification.NotificationViewModel
import com.yousfi.hayatiineApp.ui.fragment.notification.adapter.NotificationAdapter


class BindingAdapters {
    companion object {
        private val TAG = "BindingAdapters"


               @JvmStatic
               @BindingAdapter("recycler_list_article")
               fun recyclerListArticle(recyclerView: RecyclerView, viewModel: HomeViewModel) {
     val adapter = ArticleInMainAdapter(viewModel, viewModel.listArticle)
     val manager =
         GridLayoutManager(recyclerView.context, 2, GridLayoutManager.VERTICAL, false)
     recyclerView.layoutManager = manager
     recyclerView.adapter = adapter
     adapter.notifyDataSetChanged()

 }
        @JvmStatic
        @BindingAdapter("recycler_list_favoris")
        fun recyclerListFavoris(recyclerView: RecyclerView, viewModel: FavorisViewModel) {
            val adapter = FavorisAdapter(viewModel , viewModel.listFavori)
            val manager =
                GridLayoutManager(recyclerView.context, 2, GridLayoutManager.VERTICAL, false)
            recyclerView.layoutManager = manager
            recyclerView.adapter = adapter
            adapter.notifyDataSetChanged()

        }
        @JvmStatic
        @BindingAdapter("recycler_list_notification")
        fun recyclerListNotification(recyclerView: RecyclerView, viewModel: NotificationViewModel) {
            val adapter = NotificationAdapter(viewModel,viewModel.listNotification)
            val l = LinearLayoutManager(
                recyclerView.context,
                LinearLayoutManager.VERTICAL,
                false
            )
            recyclerView.layoutManager = l
            recyclerView.adapter = adapter
            recyclerView.addItemDecoration(
                object : DividerItemDecoration(recyclerView.context, l.orientation) {
                    override fun getItemOffsets(
                        outRect: Rect,
                        view: View,
                        parent: RecyclerView,
                        state: RecyclerView.State
                    ) {
                        val position = parent.getChildAdapterPosition(view)
                        if (position == parent.adapter!!.itemCount - 1) {
                            outRect.setEmpty()
                        } else {
                            super.getItemOffsets(outRect, view, parent, state)
                        }
                    }
                }
            )
            adapter.notifyDataSetChanged()

        }




        @JvmStatic
        @BindingAdapter("recycler_list_category")
        fun recyclerListCategory(recyclerView: RecyclerView, viewModel: AddViewModel) {
            val adapter = CategoryAdapter(viewModel , viewModel.listCategory)
            val manager =
                LinearLayoutManager(recyclerView.context,LinearLayoutManager.HORIZONTAL, false)
            recyclerView.layoutManager = manager
            recyclerView.adapter = adapter
            adapter.notifyDataSetChanged()

        }

        @JvmStatic
        @BindingAdapter("recycler_list_subCategory")
        fun recyclerListSubCategory(recyclerView: RecyclerView, viewModel: AddViewModel) {
            val adapter = SubCategoryAdapter(viewModel,viewModel.listsubCategory)
            val manager =
                GridLayoutManager(recyclerView.context, 2, GridLayoutManager.HORIZONTAL, false)
            recyclerView.layoutManager = manager
            recyclerView.adapter = adapter
            adapter.notifyDataSetChanged()

        }



    }
}