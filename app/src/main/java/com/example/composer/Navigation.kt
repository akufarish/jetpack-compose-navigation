package com.example.composer

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Login.route ) {
        composable(route = Screen.Login.route) {
            Login(navController = navController)
        }
        
        composable(route = Screen.Register.route) {
            Register(navController = navController)
        }
        
        composable(route = Screen.Dashboard.route) {
            Dashboard(navController = navController)
        }
    }
}