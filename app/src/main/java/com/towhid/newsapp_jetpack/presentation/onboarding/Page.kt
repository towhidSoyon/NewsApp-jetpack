package com.towhid.newsapp_jetpack.presentation.onboarding

import androidx.annotation.DrawableRes
import com.towhid.newsapp_jetpack.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Loreum Ipsum",
        description = "Loreum Ipsum Loreum Ipsum Loreum Ipsum Loreum Ipsum Loreum Ipsum Loreum Ipsum Loreum Ipsum Loreum Ipsum Loreum Ipsum",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Loreum Ipsum",
        description = "Loreum Ipsum Loreum Ipsum Loreum Ipsum Loreum Ipsum Loreum Ipsum Loreum Ipsum Loreum Ipsum Loreum Ipsum Loreum Ipsum",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Loreum Ipsum",
        description = "Loreum Ipsum Loreum Ipsum Loreum Ipsum Loreum Ipsum Loreum Ipsum Loreum Ipsum Loreum Ipsum Loreum Ipsum Loreum Ipsum",
        image = R.drawable.onboarding3
    )

)
