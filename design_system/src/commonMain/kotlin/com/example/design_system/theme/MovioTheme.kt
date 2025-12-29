package com.example.design_system.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import com.example.design_system.color.darkThemeColors
import com.example.design_system.color.lightThemeColors
import com.example.design_system.radius.appRadius
import com.example.design_system.spacing.appSpacing
import com.example.design_system.typography.Typography
import com.example.design_system.typography.createThemeTypography
import com.example.design_system.utils.AppTheme


@Composable
fun MovioTheme(
    theme: AppTheme = AppTheme.DARK,
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = when (theme) {
        AppTheme.LIGHT -> lightThemeColors
        AppTheme.DARK -> darkThemeColors
        AppTheme.DEFAULT_SYSTEM -> if (isDarkTheme) darkThemeColors else lightThemeColors
    }
    val typography = createThemeTypography()

    CompositionLocalProvider(
        LocalColors provides colors,
        LocalTypography provides typography,
        LocalSpacing provides appSpacing,
        LocalRadius provides appRadius
    ) {
        content()
    }
}

internal val LocalColors = staticCompositionLocalOf { lightThemeColors }
internal val LocalTypography = staticCompositionLocalOf<Typography> { error("LocalTypography") }
internal val LocalSpacing = staticCompositionLocalOf { appSpacing }
internal val LocalRadius = staticCompositionLocalOf { appRadius }