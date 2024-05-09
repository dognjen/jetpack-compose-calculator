package com.dognjen.app.calculator.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dognjen.app.calculator.ui.theme.MyCalculatorTheme

@Composable
fun MainScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        CalculatorScreen()
        ConsoleScreen()
        UtilScreen()
    }
}

@Composable
fun CalculatorScreen() {
    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.3f)
            .padding(8.dp),
    ) {
        Text(text = "0", textAlign = TextAlign.End, fontSize = 80.sp, fontWeight = FontWeight.Bold, modifier = Modifier)
    }
}

@Composable
fun ConsoleScreen(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .background(color = Color.LightGray)
            .fillMaxSize(0.8f)
    ) {
        BoxWithConstraints {
            DigitScreen(this.constraints.maxWidth,
                this.constraints.maxHeight)
        }
    }
}

@Composable
fun BoxWithRowLayout(content: @Composable RowScope.() -> Unit) {
    Row {
        content()
    }
}

@Composable
fun BoxWithLayout(content: @Composable ColumnScope.() -> Unit) {
    Column {
        content()
    }
}

@Composable
fun DigitScreen(maxHeight: Int, maxWidth: Int) {
    val localDensity = LocalDensity.current
    val parentHeightDp: Dp = with(localDensity) { maxHeight.toDp() }
    val parentWidthDp: Dp = with(localDensity) { maxWidth.toDp() }

    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {
        repeat(3) { row ->
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                repeat(3) { column ->
                    Tile((row * 3) + column + 1, parentWidthDp)
                }
            }
        }

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            Tile(0, parentWidthDp)
        }
    }
}

@Composable
fun Tile(digit: Int, parentWidthDp: Dp) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .border(width = 1.dp, color = Color.Green)
            .clickable { }
    ) {
        Text(
            text = digit.toString(),
            style = TextStyle(fontSize = parentWidthDp.value.times(0.18).sp, fontWeight = FontWeight.Light),
            modifier = Modifier
                .padding(parentWidthDp.value.times(0.02).dp)//.padding(15.dp)
                .padding(horizontal = parentWidthDp.value.times(0.04).dp)//.padding(horizontal = 25.dp)
        )
    }
}

@Composable
fun UtilScreen() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.LightGray)
    ) {
        Text(text = "util bree")
    }
}

@Preview(name = "Digit screen", device = Devices.NEXUS_5)
@Composable
fun PreviewDigitScreen() {
    MyCalculatorTheme {
        DigitScreen(1280, 720)
    }
}

@Preview
@Composable
fun PreviewMainScreen() {
    MyCalculatorTheme {
        MainScreen()
    }
}