package com.abmn.chapter04.materialcomponents

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PacktCentralAlignedTopBar(){
    CenterAlignedTopAppBar(
        title = { Text(text = "Packt Publishing")}
    )
}