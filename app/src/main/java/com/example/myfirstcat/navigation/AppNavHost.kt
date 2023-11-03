package com.example.myfirstcat.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myfirstcat.ui.theme.screens.calculator.CalculatorScreen
import com.example.myfirstcat.ui.theme.screens.home.HomeScreen
import com.example.myfirstcat.ui.theme.screens.intent.IntentScreen
import com.example.myfirstcat.ui.theme.screens.scale.ScaleScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String= ROUTE_HOME
){
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ){
        composable(ROUTE_HOME){
            HomeScreen(navController = navController)
        }
        composable(ROUTE_CALCULATOR){
            CalculatorScreen(navController = navController)
        }
        composable(ROUTE_INTENT){
            IntentScreen(navController = navController)
        }
        composable(ROUTE_SCALE){
            ScaleScreen(navController = navController)
        }


    }
}