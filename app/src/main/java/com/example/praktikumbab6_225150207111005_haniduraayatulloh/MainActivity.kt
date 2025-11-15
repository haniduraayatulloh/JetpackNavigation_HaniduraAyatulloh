package com.example.praktikumbab6_225150207111005_haniduraayatulloh

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.praktikumbab6_225150207111005_haniduraayatulloh.NavGraph
import com.example.praktikumbab6_225150207111005_haniduraayatulloh.ui.theme.PraktikumBab6_225150207111005_HaniduraAyatullohTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Panggil fungsi Composable utama di sini
            AppNavigation()
        }
    }
}


@Composable
fun AppNavigation() {

    PraktikumBab6_225150207111005_HaniduraAyatullohTheme {


        val navController = rememberNavController()


        NavGraph(navController = navController)
    }
}


@Preview(showBackground = true)
@Composable
fun NavAppPreview() {
    AppNavigation()
}