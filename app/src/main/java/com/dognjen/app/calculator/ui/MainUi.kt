package com.dognjen.app.calculator.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainScreen() {
    Row {
        CalculatorScreen()
        DigitScreen()
        UtilScreen()
    }
}

@Composable
fun CalculatorScreen() {
    Column(modifier = Modifier.background(color = Color.Cyan)) {

    }
}

@Composable
fun DigitScreen() {
    Column(modifier = Modifier.background(color = Color.Green)) {

    }
}

@Composable
fun UtilScreen() {
    Column(modifier = Modifier.background(color = Color.DarkGray)) {

    }
}

@Preview
@Composable
fun PreviewMainScreen() {
    MainScreen()
}