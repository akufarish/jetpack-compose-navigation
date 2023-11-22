package com.example.composer

sealed class Screen(val route: String) {
    object Dashboard: Screen("dashboard")
    object Login: Screen("login")
    object Register: Screen("register")
}
