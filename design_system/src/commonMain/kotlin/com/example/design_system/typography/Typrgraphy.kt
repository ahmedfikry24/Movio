package com.example.design_system.typography

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle

@Immutable
data class Typography(
    val display: Display,
    val headline: Headline,
    val title: Title,
    val body: Body,
    val label: Label,
) {

    data class Display(
        val largeBold24: TextStyle,
        val largeBold20: TextStyle,
        val largeBold18: TextStyle,
        val mediumMedium20: TextStyle,
    )

    data class Headline(
        val largeBold18: TextStyle,
        val largeBold16: TextStyle,
        val mediumMedium18: TextStyle,
        val mediumMedium16: TextStyle,
    )

    data class Title(
        val largeBold16: TextStyle,
        val mediumMedium16: TextStyle,
        val largeBold14: TextStyle,
        val mediumMedium14: TextStyle,
    )

    data class Label(
        val mediumMedium16: TextStyle,
        val mediumMedium14: TextStyle,
        val smallRegular14: TextStyle,
        val mediumMedium12: TextStyle,
        val smallRegular12: TextStyle,
    )

    data class Body(
        val smallRegular16: TextStyle,
        val mediumMedium14: TextStyle,
        val mediumMedium12: TextStyle,
        val smallRegular10: TextStyle,
    )
}