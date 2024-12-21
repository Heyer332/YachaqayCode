package com.example.yachaqaycode

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
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

@Composable
fun PantallaIntroduccion_3(navController: NavController) {
    Scaffold(
        bottomBar = {
            botones(navController)
        },
        topBar = {
            retroceder(navController)
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color.White, Color(0xFFA8F5F0))
                    )
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp, vertical = 32.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                // Encabezado con Imagen
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Spacer(modifier = Modifier.height(56.dp))
                    Text(
                        text = "¿por que Python?",
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center,
                        color = Color(0xFF333333),
                        fontSize = 24.sp
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Image(
                        painter = painterResource(id = R.drawable.pyton1), // Asegúrate de tener una imagen de recurso
                        contentDescription = "Logo de Yachaqay Code",
                        modifier = Modifier
                            .height(120.dp)
                            .padding(bottom = 16.dp),
                        contentScale = ContentScale.Fit
                    )


                }

                // Descripción principal
                Text(
                    text = "Python es un lenguaje sencillo y poderoso, ideal para principiantes. Su sintaxis clara facilita el aprendizaje y permite desarrollar aplicaciones rápidamente. Se usa en campos como desarrollo web, automatización, análisis de datos e inteligencia artificial. Además, cuenta con una gran comunidad y recursos que te ayudarán a resolver problemas de manera eficiente.",
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center,
                    color = Color.Gray,
                    modifier = Modifier.padding(vertical = 8.dp)
                )

                // Botón Siguiente con efecto de estilo
                Button(
                    onClick = { navController.navigate(route = appcambio.inicioxd.route) },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00B4D8)),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                ) {
                    Text(
                        text = "Siguiente",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
        }
    }
}



