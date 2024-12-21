package com.example.yachaqaycode

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Appnevegation() {
     val navController = rememberNavController()
     NavHost(navController = navController, startDestination = appcambio.FondoPantalla.route) {
          // Pantallas iniciales
          composable(route = appcambio.FondoPantalla.route) {
               FondoPantalla(navController)
          }
          composable(route = appcambio.inicio_sesion.route) {
               inicio_sesion(navController)
          }
          composable(route = appcambio.crear_cuenta.route) {
               crear_cuenta(navController)
          }
          composable(route = appcambio.CreaTuPerfilScreen.route) {
               CreaTuPerfilScreen(navController)
          }
          composable(route = appcambio.selecionar_nivel.route) {
               selecionar_nivel(navController)
          }

          // Inicio
          composable(route = appcambio.inicioxd.route) {
               inicioxd(navController)
          }

          // Introducciones
          composable(route = appcambio.PantallaIntroduccion.route) {
               PantallaIntroduccion(navController)
          }
          composable(route = appcambio.PantallaIntroduccion_2.route) {
               PantallaIntroduccion_2(navController)
          }
          composable(route = appcambio.PantallaIntroduccion_3.route) {
               PantallaIntroduccion_3(navController)
          }
          //cursos
          composable(route = appcambio.CursosScreen.route) {
               CursosScreen(navController)
          }
          composable(route = appcambio.Cursos_intro.route)
          {
               Cursos_intro(navController)
          }

          //tareas

          composable(route = appcambio.Tareasxd.route)
          {
               Tareasxd(navController)
          }
          composable(appcambio.tareas_horarios.route)
          {
               tareas_horarios(navController)
          }
          // Agregando rutas adicionales para las opciones del menú en `inicioxd`
         /*
          composable(route = appcambio.tareas.route) {
               TareasScreen(navController)
          }
          composable(route = appcambio.recursos.route) {
               RecursosScreen(navController)
          }

          */
     }
}
