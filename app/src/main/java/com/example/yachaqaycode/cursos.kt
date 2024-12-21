package com.example.yachaqaycode

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun CursosScreen(navController: NavController) {
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
                .padding(paddingValues)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color.White, Color(0xFFA8F5F0))
                    )
                )
        ) {
            // Barra de búsqueda
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp)
                    .background(Color.White, shape = RoundedCornerShape(12.dp))
                    .padding(horizontal = 16.dp, vertical = 12.dp)
            ) {
                val searchText = remember { "" }
                BasicTextField(
                    value = searchText,
                    onValueChange = {},
                    textStyle = TextStyle(
                        color = Color.Gray,
                        fontSize = 16.sp
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    decorationBox = { innerTextField ->
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(modifier = Modifier.width(8.dp))
                            Box(Modifier.weight(1f)) {
                                if (searchText.isEmpty()) {
                                    Text(
                                        text = "Buscar Curso",
                                        color = Color.Gray,
                                        fontSize = 16.sp
                                    )
                                }
                                innerTextField()
                            }
                        }
                    }
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Lista de cursos
            Column(
                modifier = Modifier.padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                CursoCard(
                    title = "Introducción C++",
                    subtitle = "01/30",
                    buttonText = "Continuar",
                    backgroundColor = Color(0xFFB0E3FF),
                    navController = navController,
                    route = appcambio.Cursos_intro.route,
                )
                CursoCard(
                    title = "Intermedio C++",
                    subtitle = "01/30",
                    buttonText = "Iniciar",
                    backgroundColor = Color(0xFFD6E9FE),
                    navController = navController,
                    route = "curso_intermedio_cpp"
                )
                CursoCard(
                    title = "Avanzado C++",
                    subtitle = "01/30",
                    buttonText = "Iniciar",
                    backgroundColor = Color(0xFFC5DDF5),
                    navController = navController,
                    route = "curso_avanzado_cpp"
                )
                CursoCard(
                    title = "Introducción Python",
                    subtitle = "01/30",
                    buttonText = "Iniciar",
                    backgroundColor = Color(0xFFF3FFE1),
                    navController = navController,
                    route = "curso_intro_python"
                )
            }
        }
    }
}

@Composable
fun CursoCard(
    title: String,
    subtitle: String,
    buttonText: String,
    backgroundColor: Color,
    navController: NavController,
    route: String
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp), // Altura ajustada para mejor presentación
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .weight(3f)
                    .padding(start = 16.dp, top = 16.dp, bottom = 16.dp, end = 8.dp)
            ) {
                Text(
                    text = title,
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = subtitle,
                    color = Color.Gray,
                    fontSize = 14.sp
                )
                Spacer(modifier = Modifier.height(8.dp))
                Button(
                    onClick = {
                        navController.navigate(route)
                    },
                    modifier = Modifier
                        .width(120.dp)
                        .height(40.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0088CC))
                ) {
                    Text(
                        text = buttonText,
                        color = Color.White,
                        fontSize = 14.sp
                    )
                }
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

}

@Preview
@Composable
fun CursosScreenPreview() {
    val navController = rememberNavController()
    CursosScreen(navController)
}
