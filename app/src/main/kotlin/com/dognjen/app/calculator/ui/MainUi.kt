package com.dognjen.app.calculator.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "main bree")
        CalculatorScreen()
        DigitScreen()
        UtilScreen()
    }
}

@Composable
fun CalculatorScreen() {
    Row(modifier = Modifier.fillMaxWidth().background(color = Color.Cyan)) {
        Text(text = "calculator bree")
    }
}

@Composable
fun DigitScreen() {
    Row(modifier = Modifier.fillMaxWidth().background(color = Color.Green)) {
        Text(text = "digit bree")
    }
}

@Composable
fun UtilScreen() {
    Row(modifier = Modifier.fillMaxWidth().background(color = Color.DarkGray)) {
        Text(text = "util bree")
    }
}

@Preview
@Composable
fun PreviewMainScreen() {
    MainScreen()
}