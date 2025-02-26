package com.abmn.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.abmn.myapp.ui.theme.MyappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyappTheme {
                    PacktPublishing("Android")
                }
            }
        }
    }

@Composable
fun PacktPublishing(bookName: String) {
    Text(
        text = "Title of the book is: $bookName",
    )
}

@Preview(showBackground = true)
@Composable
fun PacktPublishingPreview() {
    PacktPublishing("Andriod Development with Kotlin")
}