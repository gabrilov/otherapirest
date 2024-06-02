package com.rlibanez.otherapirest.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen(navController: NavHostController) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Button(onClick = { navController.navigate("search") }) {
            Text(text = "BUSCAR")
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun MainScreenPreview() {
    MainScreen(navController = rememberNavController())
}