package com.example.jetpackcanvas

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcanvas.ui.theme.JetPackCanvasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackCanvasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@SuppressLint("SuspiciousIndentation")
@Composable
fun Greeting(
) {
  val course:Course = Course(
      secondLightColor = Color(0.373f, 0.792f, 0.98f, 1.0f),
      lightColor = Color(0.267f, 0.761f, 0.988f, 1.0f),
      secondMediumColor = Color(0.196f, 0.737f, 0.98f, 1.0f),
      mediumColor = Color(0.102f, 0.698f, 0.969f, 1.0f),
      darkColor = Color(0.008f, 0.675f, 0.973f, 1.0f)
  )
    BoxWithConstraints(
        modifier = Modifier
            .padding(7.5.dp)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(10.dp))
            .background(course.darkColor)
    ) {
        val width = constraints.maxWidth
        val height = constraints.maxHeight

        val mediumColoredPoint1 = Offset(0f, height * 0f)
        val mediumColoredPoint2 = Offset(width * 0.20f, height * 0.15f)
        val mediumColoredPoint3 = Offset(width * 0.50f, height * 0.20f)
        val mediumColoredPoint4 = Offset(width * 0.70f, height * 0.35f)
        val mediumColoredPoint5 = Offset(width * 1.3f, -height.toFloat())

        val mediumColoredPath = Path().apply {
            moveTo(mediumColoredPoint1.x, mediumColoredPoint1.y)
            standardQuadFromTo(mediumColoredPoint1, mediumColoredPoint2)
            standardQuadFromTo(mediumColoredPoint2, mediumColoredPoint3)
            standardQuadFromTo(mediumColoredPoint3, mediumColoredPoint4)
            standardQuadFromTo(mediumColoredPoint4, mediumColoredPoint5)
            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f, height.toFloat() + 100f)
            close()
        }


        val secondMediumColoredPoint1 = Offset(0f, height * 0f)
        val secondMediumColoredPoint12 = Offset(width * 0.20f, height * 0.25f)
        val secondMediumColoredPoint13 = Offset(width * 0.40f, height * 0.30f)
        val secondMediumColoredPoint14 = Offset(width * 0.55f, height * 0.45f)
        val secondMediumColoredPoint15 = Offset(width * 0.25f, -height.toFloat())

        val secondMediumColoredPath = Path().apply {
            moveTo(secondMediumColoredPoint1.x, secondMediumColoredPoint1.y)
            standardQuadFromTo(secondMediumColoredPoint1, secondMediumColoredPoint12)
            standardQuadFromTo(secondMediumColoredPoint12, secondMediumColoredPoint13)
            standardQuadFromTo(secondMediumColoredPoint13, secondMediumColoredPoint14)
            standardQuadFromTo(secondMediumColoredPoint14, secondMediumColoredPoint15)
            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f, height.toFloat() + 100f)
            close()
        }

        val lightPoint1 = Offset(0f, height * 0.0f)
        val lightPoint2 = Offset(width * 0.20f, height * 0.4f)
        val lightPoint3 = Offset(width * 0.40f, height * 0.55f)
        val lightPoint4 = Offset(width * 0.80f, height.toFloat())
        val lightPoint5 = Offset(width * 1.9f, -height.toFloat() / 0.18f)

        val lightColoredPath = Path().apply {
            moveTo(lightPoint1.x, lightPoint1.y)
            standardQuadFromTo(lightPoint1, lightPoint2)
            standardQuadFromTo(lightPoint2, lightPoint3)
            standardQuadFromTo(lightPoint3, lightPoint4)
            standardQuadFromTo(lightPoint4, lightPoint5)
            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f, height.toFloat() + 100f)
            close()
        }

        val secondLightPoint1 = Offset(0f, height * 0.0f)
        val secondLightPoint2 = Offset(width * 0.20f, height * 0.75f)
        val secondLightPoint3 = Offset(width * 0.40f, height * 0.85f)
        val secondLightPoint4 = Offset(width * 0.50f, height.toFloat())
        val secondLightPoint5 = Offset(width * 1.9f, -height.toFloat() / 0.18f)

        val secondLightColoredPath = Path().apply {
            moveTo(secondLightPoint1.x, secondLightPoint1.y)
            standardQuadFromTo(secondLightPoint1, secondLightPoint2)
            standardQuadFromTo(secondLightPoint2, secondLightPoint3)
            standardQuadFromTo(secondLightPoint3, secondLightPoint4)
            standardQuadFromTo(secondLightPoint4, secondLightPoint5)
            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f, height.toFloat() + 100f)
            close()
        }

        Canvas(
            modifier = Modifier
                .fillMaxSize()
        ) {

            drawPath(

                path = mediumColoredPath,
                color = course.mediumColor
            )
            drawPath(

                path = secondMediumColoredPath,
                color = course.secondMediumColor
            )
            drawPath( // it's for the lighter path
                path = lightColoredPath,
                color = course.lightColor
            )
            drawPath( // it's for the lighter path
                path = secondLightColoredPath,
                color = course.secondLightColor
            )
        }

    }

}


fun Path.standardQuadFromTo(from: Offset, to: Offset) {
    quadraticBezierTo(
        from.x,
        from.y,
        kotlin.math.abs(from.x + to.x) / 2f,
        kotlin.math.abs(from.y + to.y) / 2f
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetPackCanvasTheme {
        Greeting()
    }
}