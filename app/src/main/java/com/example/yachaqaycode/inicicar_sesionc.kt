package com.example.yachaqaycode

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.navigation.NavController


@Composable
fun inicio_sesion(navController: NavController) {
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
                .padding(top = 64.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.python),
                contentDescription = "Logo de achaqayCode",
                modifier = Modifier.height(100.dp)
            )
            Spacer(modifier = Modifier.height(84.dp))

            Text(
                text = "Iniciar sesión",
                style = TextStyle(
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                )
            )

            Spacer(modifier = Modifier.height(48.dp))

            androidx.compose.material3.OutlinedTextField(
                value = "",
                onValueChange = {}, // Aquí debes manejar la lógica para capturar el valor
                label = { Text("Nombre o correo") },
                singleLine = true,
                modifier = Modifier.fillMaxWidth() // Se usa directamente sin modificar el parámetro
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Campo para contraseña
            androidx.compose.material3.OutlinedTextField(
                value = "",
                onValueChange = {}, // Aquí debes manejar la lógica para capturar el valor
                label = { Text("Contraseña") },
                visualTransformation = PasswordVisualTransformation(), // Oculta el texto de la contraseña
                singleLine = true,
                modifier = Modifier.fillMaxWidth() // Se usa directamente sin modificar el parámetro
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { navController.navigate(route = appcambio.FondoPantalla.route)},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .padding(horizontal = 14.dp) // Márgenes horizontales
            ) {
                Text(
                    text = "Iniciar sesión",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                )
            }
        }
    }
}
