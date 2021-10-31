package com.yousfi.hayatiineApp.ui.materialVerticalStepper



data class VerticalItem(
    var title: String,
    val id: String,
    var fragment: StepperFragment,
    var isOpen: Boolean = false,
    var isCompleted: Boolean = false,
    var isActive: Boolean = false
)