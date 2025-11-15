package com.example.praktikumbab6_225150207111005_haniduraayatulloh

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen (navController: NavHostController) {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button (onClick = {
            navController.navigate("detail/Hello from Home")
        }) {
            Text("Go to Detail")
        }
        Button (onClick = {

            navController.navigate("unknown")
        }) {
            Text("Go to Unknown")
        }
        Spacer (modifier = Modifier.height(16.dp))

        Button (onClick = {

            navController.navigate("profile")
        }) {
            Text("Go to Profile")
        }
    }
}