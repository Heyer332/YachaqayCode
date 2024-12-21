package com.example.yachaqaycode

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun inicioxd(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color.White, Color(0xFFA8F5F0))
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp)
        ) {
            // Barra superior personalizada
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .background(Color.White)
                    .padding(horizontal = 16.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.python), // Usa tu logo aquí
                        contentDescription = null,
                        modifier = Modifier.height(40.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Yachaqay Code",
                        style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    )
                    Spacer(modifier = Modifier.weight(1f)) // Para separar a la derecha
                    IconButton(onClick = { /* Acción para notificaciones */ }) {
                        Icon(painter = painterResource(id = R.drawable.python), contentDescription = null)
                    }
                }
            }

            // Contenido debajo de la barra superior
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Tarjetas con navegación
                CardButton(
                    text = "Introducción",
                    modifier = Modifier.padding(bottom = 16.dp),
                    onClick = { navController.navigate(appcambio.PantallaIntroduccion.route) }
                )
                CardButton(
                    text = "Cursos",
                    modifier = Modifier.padding(bottom = 16.dp),
                    onClick = {  navController.navigate(route = appcambio.CursosScreen.route)}
                )
                CardButton(
                    text = "Tareas",
                    modifier = Modifier.padding(bottom = 16.dp),
                    onClick = { navController.navigate(appcambio.Tareasxd.route) }
                )
                CardButton(
                    text = "Recursos",
                    modifier = Modifier.padding(bottom = 16.dp),
                    onClick = {  }
                )
            }
        }
    }
}


@Composable
fun CardButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth(0.8f)
            .height(120.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5BA1B1)),
        shape = RoundedCornerShape(16.dp)
    ) {
        Text(
            text = text,
            color = Color.White,
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
        )
    }
}
@Preview
@Composable
fun preview_inicio() {
    val navController = rememberNavController()
    inicioxd(navController)
}
