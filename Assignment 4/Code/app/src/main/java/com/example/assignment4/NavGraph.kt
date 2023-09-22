package com.example.assignment4

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun setupNavGraph(
    navController: NavHostController
)
{
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route)
    {
        composable(
            route = Screen.HomeScreen.route
        )
        {
            HomeScreen(navController = navController)
        }

        composable(
            route = Screen.Restaurants.route
        )
        {
            RestScreen(navController = navController)
        }

        composable(
            route = Screen.PizzaMenu.route
        )
        {
            PizzaMenuScreen(navController = navController)
        }

        composable(
            route = Screen.KFCMenu.route
        )
        {
            KFCMenuScreen(navController = navController)
        }

        composable(
            route = Screen.SubwayMenu.route
        )
        {
            SubwayMenuScreen(navController = navController)
        }
    }
}