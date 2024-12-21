package com.example.yachaqaycode

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun tareas_horarios(navController: NavController) {
    Scaffold(
        bottomBar = {
            botones(navController)
        },
        topBar = {
            retroceder(navController)
        }

    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color(0xFFE3F2FD), Color(0xFFA8F5F0))
                    )
                )
                .padding(16.dp)
        ) {
            Spacer(modifier = Modifier.height(36.dp))
            Text(
                text = "Planifica tu semana",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Coloca la imagen dentro de un LazyRow para habilitar el desplazamiento horizontal.
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(horizontal = 16.dp)
            ) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(650.dp) // Ajusta la altura según lo necesites
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.horario), // Usa tu imagen aquí
                            contentDescription = null,
                            contentScale = ContentScale.Crop, // Asegura que la imagen mantenga su relación de aspecto y se recorte si es necesario
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
            }
        }
    }
}




@Preview
@Composable
fun preview_horarios() {
    val navController = rememberNavController()
    tareas_horarios(navController)
}


