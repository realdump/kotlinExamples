package com.abmn.mytestapp1.materialcomponents

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.abmn.mytestapp1.ui.theme.MyTestApp1Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PacktSmallTopAppBar() {
    TopAppBar(
        title = {
            Text(text = "Packt Publishing")
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PackMediumTopAooBar() {
    MediumTopAppBar(
        title = {
            Text(text = "Packt Publishing")
        }
    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PackLargeTopBar() {
    LargeTopAppBar(
        title = {
            Text(text = "Packt Publishing")
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PacktCenterAlignedTopBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(text = "Packt Publishing")
        }
    )
}

@Preview
@Composable
fun PacktSmallTopAppBarPreview() {
    MyTestApp1Theme {
        PacktSmallTopAppBar()
    }
}

@Preview
@Composable
fun PackMediumTopAppBarPreview() {
    MyTestApp1Theme {
        PackMediumTopAooBar()
    }
}

@Preview
@Composable
fun PackLargeTopBarPreview() {
    MyTestApp1Theme {
        PackLargeTopBar()
    }
}

@Preview
@Composable
fun PacktCenterAlignedTopBarPreview() {
    MyTestApp1Theme {
        PacktCenterAlignedTopBar()
    }
}