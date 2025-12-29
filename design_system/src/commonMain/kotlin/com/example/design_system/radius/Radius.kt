package com.example.design_system.radius

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Radius(
    val xxs: Dp = 2.dp,
    val xs: Dp = 4.dp,
    val sm: Dp = 8.dp,
    val md: Dp = 12.dp,
    val lg: Dp = 16.dp,
    val xl: Dp = 24.dp,
    val full: Dp = 100.dp
)

internal val appRadius = Radius()