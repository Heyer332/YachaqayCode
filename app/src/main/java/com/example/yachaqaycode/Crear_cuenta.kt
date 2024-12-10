package com.example.yachaqaycode

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun crear_cuenta(navController: NavController) {
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
                text = "Crear una cuenta",
                style = TextStyle(
                    fontSize = 24.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                )
            )
            Spacer(modifier = Modifier.height(16.dp))
            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                AccountButton(
                    text = "Github",
                    color = Color(0xFF1F1A6B),
                    icon = painterResource(id = R.drawable.git2),
                    onClick = { navController.navigate(route = appcambio.CreaTuPerfilScreen.route) }
                )
                AccountButton(
                    text = "Facebook",
                    color = Color(0xFF3A668C),
                    icon = painterResource(id = R.drawable.face2)
                )
                AccountButton(
                    text = "Google",
                    color = Color(0xFF5BA1B1),
                    icon = painterResource(id = R.drawable.google2)
                )
                AccountButton(
                    text = "E-mail",
                    color = Color(0xFF88D7E6),
                    icon = painterResource(id = R.drawable.icon2)
                )
            }
        }
    }
}

@Composable
fun AccountButton(
    text: String,
    color: Color,
    icon: Painter,
    onClick: (() -> Unit)? = null // Lambda opcional para manejar clics
) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(0.8f)
            .height(48.dp)
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
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
