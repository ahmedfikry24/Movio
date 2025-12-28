package com.example.design_system.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import movio.design_system.generated.resources.Res
import movio.design_system.generated.resources.inter_bold
import movio.design_system.generated.resources.inter_medium
import movio.design_system.generated.resources.inter_regular
import org.jetbrains.compose.resources.Font

@Composable
fun createThemeTypography(): Typography {
    val inter = FontFamily(
        fonts = listOf(
            Font(resource = Res.font.inter_bold, weight = FontWeight.Bold),
            Font(resource = Res.font.inter_medium, weight = FontWeight.Medium),
            Font(resource = Res.font.inter_regular, weight = FontWeight.Normal),
        ),
    )

    return Typography(
        display = Typography.Display(
            largeBold24 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            ),
            largeBold20 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            ),
            mediumMedium20 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Medium,
                fontSize = 20.sp
            ),
            largeBold18 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
        ),
        headline = Typography.Headline(
            largeBold18 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            ),
            mediumMedium18 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp
            ),
            largeBold16 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            ),
            mediumMedium16 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp
            )
        ),
        title = Typography.Title(
            largeBold16 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            ),
            mediumMedium16 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp
            ),
            largeBold14 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
            ),
            mediumMedium14 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp
            )
        ),
        label = Typography.Label(
            mediumMedium16 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp
            ),
            mediumMedium14 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp
            ),
            smallRegular14 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp
            ),
            mediumMedium12 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp
            ),
            smallRegular12 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp
            )
        ),
        body = Typography.Body(
            smallRegular16 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
            ),
            mediumMedium14 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp
            ),
            mediumMedium12 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp
            ),
            smallRegular10 = TextStyle(
                fontFamily = inter,
                fontWeight = FontWeight.Normal,
                fontSize = 10.sp
            )
        ),
    )
}