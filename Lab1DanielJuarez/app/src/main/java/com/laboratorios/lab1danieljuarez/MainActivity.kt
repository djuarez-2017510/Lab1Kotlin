package com.laboratorios.lab1danieljuarez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.laboratorios.lab1danieljuarez.ui.theme.Lab1DanielJuarezTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab1DanielJuarezTheme {
                Scaffold(modifier = Modifier .background(Color(0xFF000000))) { innerPadding ->
                    Lab1(
                        name = "Daniel",
                        modifier = Modifier.padding(innerPadding),
                        onCloseClick = {finish()}

                    )
                }
            }
        }
    }
}

@Composable
fun Lab1(name: String, modifier: Modifier = Modifier,onCloseClick: () -> Unit) {
    Column (
        modifier = modifier .fillMaxSize() .background(Color(0xFF000000)) ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top

            ){
        Text(
            text = "Holis $name",
            modifier = modifier,
            color = Color(0xFFFA6C15),
            fontFamily = FontFamily.Serif,
            fontSize = 55.sp,
            lineHeight = 1.sp,
            letterSpacing = 3.sp

        )
        Text(
            text = "Viva la Bachata",
            modifier = modifier,
            color = Color(0xFFFAE915),
            fontFamily = FontFamily.Cursive,
            fontSize = 45.sp,
            lineHeight = 1.sp,
            letterSpacing = 3.sp
        )
        Text(
            text = "Vivan los Monitos",
            modifier = modifier,
            color = Color(0xFFFAE915),
            fontFamily = FontFamily.Cursive,
            fontSize = 45.sp,
            lineHeight = 1.sp,
            letterSpacing = 3.sp
        )

        Button(
            onClick = onCloseClick,
            shape = ButtonDefaults.shape,
            colors = ButtonDefaults.buttonColors(Color(0xFFff9f25))) {
            Text(text = "Ver",
                fontSize = 35.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab1DanielJuarezTheme {
        Lab1("Daniel", onCloseClick = {})
    }
}