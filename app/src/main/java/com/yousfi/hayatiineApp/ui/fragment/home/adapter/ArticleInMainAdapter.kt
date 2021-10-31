package com.yousfi.hayatiineApp.ui.fragment.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ObservableArrayList
import com.yousfi.hayatiine.ui.base.BaseViewHolder
import com.yousfi.hayatiineApp.data.entities.Article
import com.yousfi.hayatiineApp.databinding.ListItemArticleBinding
import com.yousfi.hayatiineApp.ui.base.ObservableRecyclerViewAdapter
import com.yousfi.hayatiineApp.ui.fragment.home.HomeViewModel


class ArticleInMainAdapter(
    private var viewModel: HomeViewModel,
    private var articlesList: ObservableArrayList<Article>
) : ObservableRecyclerViewAdapter<Article, BaseViewHolder<Article>>(
    articlesList
) {
    private lateinit var model: HomeViewModel
    private val TAG = "ArticleInMainAdapter"

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<Article> {
        return Holder(
            ListItemArticleBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Article>, position: Int) {
        holder.bind(articlesList[position])
    }

    inner class Holder(private val binding: ListItemArticleBinding) :
        BaseViewHolder<Article>(binding.root) {
        override fun bind(item: Article) {
            binding.item=item
            //   Glide.with(binding.root).load(Const.BASE_IMAGE_URL + item.imageUrl)
            //        .into(binding.logoImageView)

            /*    when {
                LanguageSettings.getLanguage() == "en" -> {
                    binding.titleServiceTextView.text = item.nameAN
//                    binding.descriptionServiceTextView.text = item.descriptionAN
                }
                LanguageSettings.getLanguage() == "fr" -> {
                    binding.titleServiceTextView.text = item.nameFR
//                    binding.descriptionServiceTextView.text = item.descriptionFR
                }
                LanguageSettings.getLanguage() == "ar" -> {
                    binding.titleServiceTextView.text = item.nameAR
//                    binding.descriptionServiceTextView.text = item.descriptionAR
                }
                LanguageSettings.getLanguage() == "tr" -> {
                    binding.titleServiceTextView.text = item.nameTR
//                    binding.descriptionServiceTextView.text = item.descriptionTR
                }
            }*/
            // binding.offreCardview.setOnClickListener {
            /*     when {
                    LanguageSettings.getLanguage() == "ar" -> {
                        GlobalUtils.navigateToActivityRightToLeftWithExtra(
                            binding.root.context as Activity,
                            binding.root.context,
                            SearchActivity::class.java,
                            item.id!!
                        )
                    }
                    else -> {
                        GlobalUtils.navigateToActivityRightToLeftWithExtra(
                            binding.root.context as Activity,
                            binding.root.context,
                            SearchActivity::class.java,
                            item.id!!
                        )
                    }
                }*//*
          //  }

        }
    }*/
        }
    }
}