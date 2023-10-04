package com.notrew.buddhify

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape

import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme(colors = lightColors(background = Color.Black, onPrimary = Color.White, onBackground = Color.Black)) {
                Surface(modifier = androidx.compose.ui.Modifier.fillMaxSize(), color = Color.Black) {
                    Row {
                        Box(modifier = Modifier
                            .size(70.dp).padding(16.dp)
                            .background(color = Color.Cyan).clip(CircleShape))
                        Spacer(modifier = Modifier.size(40.dp))
                        Column {
                            Text(color = Color.White, text = "Welcome Back!")
                            Text(color = Color.White, text = "Notrew!")
                        }
                    }
                }
            }
        }
    }
}
