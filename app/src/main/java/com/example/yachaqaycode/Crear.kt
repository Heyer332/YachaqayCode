package com.example.yachaqaycode

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun CreaTuPerfilScreen(navController: NavController) {
    val nombre = remember { mutableStateOf("") }
    val usuario = remember { mutableStateOf("") }
    val contrasena = remember { mutableStateOf("") }
    val correo = remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color.White, Color(0xFF88D7E6))
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Crea tu Perfil",
                style = TextStyle(
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                ),
                modifier = Modifier.padding(top = 32.dp, bottom = 24.dp)
            )

            // Campos de texto mejorados
            TransparentTextField(value = nombre.value, label = "Nombre") { nombre.value = it }
            TransparentTextField(value = usuario.value, label = "Nombre de Usuario") { usuario.value = it }
            TransparentTextField(
                value = contrasena.value,
                label = "Contraseña",
                keyboardType = KeyboardType.Password
            ) { contrasena.value = it }
            TransparentTextField(value = correo.value, label = "Correo Electrónico") { correo.value = it }

            Spacer(modifier = Modifier.height(32.dp))

            // Botón
            Button(
                onClick = { navController.navigate(route = appcambio.selecionar_nivel.route) },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1F1A6B)),
                modifier = Modifier
                    .fillMaxWidth(0.6f)
                    .height(48.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = "Crear",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TransparentTextField(
    value: String,
    label: String,
    keyboardType: KeyboardType = KeyboardType.Text,
    onValueChange: (String) -> Unit
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label, color = Color.Gray) },
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .padding(vertical = 8.dp),
        colors = TextFieldDefaults.textFieldColors(
            focusedLabelColor = Color(0xFF5BA1B1),
            unfocusedLabelColor = Color.Gray,
            focusedIndicatorColor = Color(0xFF5BA1B1),
            unfocusedIndicatorColor = Color.Gray,
            containerColor = Color.Transparent,
            cursorColor = Color(0xFF1F1A6B),
            focusedTextColor = Color.Black,
            unfocusedTextColor = Color.Black
        ),
        shape = RoundedCornerShape(12.dp),
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType)
    )
}

