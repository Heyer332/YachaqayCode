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

@Preview(showSystemUi = true)
@Composable
fun YachaQayScreen() {
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
            // Barra superior personalizada (sin TopAppBar)
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
                // Tarjetas
                CardButton(text = "Introducción", modifier = Modifier.padding(bottom = 16.dp))
                CardButton(text = "Cursos", modifier = Modifier.padding(bottom = 16.dp))
                CardButton(text = "Tareas", modifier = Modifier.padding(bottom = 16.dp))
                CardButton(text = "Recursos", modifier = Modifier.padding(bottom = 16.dp))
            }
        }
    }
}

@Composable
fun CardButton(
    text: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth(0.8f)
            .height(120.dp)
            .background(
                color = Color(0xFF5BA1B1), // Puedes cambiar este color o usar otro
                shape = RoundedCornerShape(16.dp)
            )
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = Color.White,
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
        )
    }
}
