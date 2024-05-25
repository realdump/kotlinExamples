package com.abmn.chaptertwo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abmn.chaptertwo.ui.theme.ChaptertwoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChaptertwoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PackPublishing("Android")
                }
            }
        }
    }
}

@Composable
fun PackPublishing(bookName: String) {

    // SIMPLE TEXT EXAMPLE

//    Text(
//        modifier = Modifier.fillMaxWidth()
//            .padding(16.dp)
//            .background(Color.Green),
//        text = "Title of the book: $bookName!"
//    )

    //SIMPLE COLUMN EXAMPLE

//    Column(modifier = Modifier
//        .fillMaxSize()
//        .padding(16.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally){
//        Text(text = "Android")
//        Text(text = "Kotlin")
//        Text(text = "Compose")
//    }

    //SIMPLE ROW EXAMPLE

//    Row(modifier = Modifier
//        .fillMaxSize()
//        .padding(16.dp),
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceEvenly){
//        Text(text = "Android")
//        Text(text = "Kotlin")
//        Text(text = "Compose")
//    }

    //SIMPLE BOX EXAMPLE

//    Box(
//        modifier = Modifier.size(100.dp),
//        contentAlignment = Alignment.Center
//    ) {
//        Icon(
//            modifier = Modifier.size(80.dp),
//            imageVector = Icons.Outlined.Notifications,
//            contentDescription = null,
//            tint = Color.Red
//        )
//        Text(text = "3")
//    }

    LazyColumn(modifier = Modifier.fillMaxSize()
        .background(Color.LightGray)) {
        items(100){
            Text(
                modifier = Modifier.padding(8.dp), text = "Item number $it"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PackPublishingPreview() {
    PackPublishing("Andriod Development with kotlin")
}