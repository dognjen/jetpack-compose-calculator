package com.dognjen.app.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.dognjen.app.calculator.ui.MainScreen
import com.dognjen.app.calculator.ui.theme.MyCalculatorTheme

class CalculatorActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyCalculatorTheme {
                MainScreen()
            }
        }
    }
}

