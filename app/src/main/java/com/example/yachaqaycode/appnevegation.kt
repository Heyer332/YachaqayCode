package com.example.yachaqaycode

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Appnevegation(){
     val navController = rememberNavController()
     NavHost(navController = navController, startDestination = appcambio.FondoPantalla.route ) {
          composable(route = appcambio.FondoPantalla.route){
               FondoPantalla(navController)
          }
          composable(route = appcambio.inicio_sesion.route){
               inicio_sesion(navController)
          }
     }

}