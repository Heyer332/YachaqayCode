    package com.example.yachaqaycode

    import androidx.compose.foundation.Image
    import androidx.compose.foundation.background
    import androidx.compose.foundation.layout.*
    import androidx.compose.foundation.shape.RoundedCornerShape
    import androidx.compose.material.icons.filled.ArrowForward
    import androidx.compose.material.icons.filled.CheckCircle
    import androidx.compose.material3.Button
    import androidx.compose.material3.Card
    import androidx.compose.material3.CardDefaults
    import androidx.compose.material3.Divider
    import androidx.compose.material3.Icon
    import androidx.compose.material3.Scaffold
    import androidx.compose.material3.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.graphics.Brush
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.layout.ContentScale
    import androidx.compose.ui.res.painterResource
    import androidx.compose.ui.text.font.FontWeight
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import androidx.compose.ui.tooling.preview.Preview
    import androidx.navigation.NavController
    import androidx.navigation.compose.rememberNavController





    @Composable
    fun Cursos_intro(navController: NavController) {
        Scaffold(
            bottomBar = {
                botones(navController)
            },
            topBar = {
                retroceder(navController)
            }
        ) { PaddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()

                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(Color.White, Color(0xFFA8F5F0))
                        )
                    )
                    .padding(36.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceBetween // Distribuir espacio entre elementos
                ) {
                    // Contenido principal
                    Column {
                        // Header destacado
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp),
                            shape = RoundedCornerShape(16.dp),
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(Color(0xFF4682B4)), // Color azul similar al de la imagen
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column(
                                    modifier = Modifier
                                        .padding(16.dp)
                                        .weight(1f),
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Text(
                                        text = "Introducción C++",
                                        color = Color.White,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Text(
                                        text = "01:30",
                                        color = Color.White.copy(alpha = 0.7f),
                                        fontSize = 16.sp
                                    )
                                }
                                Image(
                                    painter = painterResource(id = R.drawable.cpp),
                                    contentDescription = "Icono del curso",
                                    modifier = Modifier
                                        .weight(1f)
                                        .padding(8.dp)
                                        .size(64.dp),
                                    contentScale = ContentScale.Fit
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(24.dp))

                        // Lista de temas
                        Text(
                            text = "Cursos",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF333333)
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        val temas = listOf(
                            "Introducción básica" to "introducción C++",
                            "Estructura básica en C++" to "Organización del código y compilación",
                            "Tipos de datos y variables" to "Definir variables y sus tipos",
                            "Operadores y expresiones" to "Realizar cálculos y comparaciones",
                            "Estructuras de control" to "Controlar el flujo del programa",
                            "Funciones" to "Reutilizar código con bloques definidos"
                        )

                        temas.forEach { tema ->
                            TemaItem(titulo = tema.first, descripcion = tema.second)
                        }
                    }

                    // Botones en la parte inferior

                }
            }
        }
    }


    @Composable
    fun TemaItem(titulo: String, descripcion: String) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical =16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = androidx.compose.material.icons.Icons.Default.CheckCircle,
                contentDescription = "Icono completado",
                tint = Color(0xFF4CAF50), // Verde
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(26.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(text = titulo, fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color(0xFF333333))
                Text(text = descripcion, fontSize = 14.sp, color = Color(0xFF666666))
            }
            Icon(
                imageVector = androidx.compose.material.icons.Icons.Default.ArrowForward,
                contentDescription = "Flecha hacia adelante",
                tint = Color(0xFFCCCCCC),
                modifier = Modifier.size(24.dp)
            )
        }
    }

    @Preview
    @Composable
    fun preview() {
        val navController = rememberNavController()
        Cursos_intro(navController)
    }