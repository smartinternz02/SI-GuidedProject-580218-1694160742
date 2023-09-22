package com.example.assignment4

sealed class Screen(val route:String) {
    object HomeScreen:Screen(route="home_screen")
    object Restaurants:Screen(route="rest_screen")
    object PizzaMenu:Screen(route="pm_screen")
    object KFCMenu:Screen(route="kfcm_screen")
    object SubwayMenu:Screen(route="subm_screen")

}
