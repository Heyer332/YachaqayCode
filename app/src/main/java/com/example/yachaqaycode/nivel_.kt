package com.example.yachaqaycode

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun selecionar_nivel(navController: NavController) {
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
                .padding(top = 128.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Seleccione su nivel",
                style = TextStyle(
                    fontSize = 24.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                ),
                modifier = Modifier.padding(top = 32.dp, bottom = 8.dp)
            )

            // Subtítulo
            Text(
                text = "Elige tu nivel, para proporcionarte la mejor clase",
                style = TextStyle(
                    fontSize = 14.sp,
                    color = Color.Gray
                ),
                modifier = Modifier.padding(bottom = 24.dp)
            )

            // Botones para cada nivel
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                AccountButton1(
                    text = "Nivel Pikachu",
                    color = Color(0xFFEFF0F7),
                    icon = painterResource(id = R.drawable.pato2),
                    onClick = { /* Acción para nivel Pikachu */ }
                )
                AccountButton1(
                    text = "Nivel Saibaman",
                    color = Color(0xFFEFF0F7),
                    icon = painterResource(id = R.drawable.pato2),
                    onClick = { /* Acción para nivel Saibaman */ }
                )
                AccountButton1(
                    text = "Nivel Goku",
                    color = Color(0xFFEFF0F7),
                    icon = painterResource(id = R.drawable.pato2),
                    onClick = { /* Acción para nivel Goku */ }
                )
                AccountButton1(
                    text = "Nivel Kratos",
                    color = Color(0xFFEFF0F7),
                    icon = painterResource(id = R.drawable.pato2),
                    onClick = { /* Acción para nivel Kratos */ }
                )
            }

            // Espacio para separar antes del botón "Continuar"
            Spacer(modifier = Modifier.height(32.dp))

            // Botón "Continuar"
            Button(
                onClick = { /* Acción para continuar */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1F1A6B)),
                modifier = Modifier
                    .fillMaxWidth(0.6f)
                    .height(48.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = "Continuar",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun AccountButton1(
    text: String,
    color: Color,
    icon: Painter,
    onClick: (() -> Unit)? = null // Lambda opcional para manejar clics
) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(0.8f)
            .height(68.dp)
            .background(color, shape = RoundedCornerShape(12.dp))
            .clickable { onClick?.invoke() },
        contentAlignment = Alignment.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = icon,
                contentDescription = null,
                modifier = Modifier.height(22.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = text,
                color = Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.Light
            )
        }
    }
}
