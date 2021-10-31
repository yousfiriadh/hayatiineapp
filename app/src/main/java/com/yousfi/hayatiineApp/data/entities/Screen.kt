package com.yousfi.hayatiineApp.data.entities

class Screen (
    var img: Int?,
    var title: String?,
    var desc: String?
) {
    override fun toString(): String {
        return "IntroData(img=$img, title=$title, desc=$desc)"
    }
}