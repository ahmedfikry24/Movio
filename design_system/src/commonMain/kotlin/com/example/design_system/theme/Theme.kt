package com.example.design_system.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.example.design_system.color.SchemaColors
import com.example.design_system.radius.Radius
import com.example.design_system.spacing.Spacing
import com.example.design_system.typography.Typography

object Theme {
    val colors: SchemaColors
        @Composable @ReadOnlyComposable get() = LocalColors.current
    val typography: Typography
        @Composable @ReadOnlyComposable get() = LocalTypography.current
    val spacing: Spacing
        @Composable @ReadOnlyComposable get() = LocalSpacing.current
    val radius: Radius
        @Composable @ReadOnlyComposable get() = LocalRadius.current
}