package com.example.yachaqaycode


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.yachaqaycode.botones

@Composable
fun Tareasxd(navController: NavController) {
    Scaffold(
        bottomBar = {
            botones(navController)
        }
        ,topBar = {
            retroceder(navController)
        }
    ){ PaddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color(0xFFE3F2FD), Color(0xFFA8F5F0))
                    )
                )
                .padding(26.dp),


        ) {
            Spacer(modifier = Modifier.height(26.dp))
            Text(
                text = "Tareas",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                text = "Administra tu tiempo, y fija tus objetivos.",
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center,
                color = Color.Gray,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            Spacer(modifier = Modifier.height(56.dp))
            // Botones de opciones
            TareaButton("Horarios", Color(0xFF1E88E5),onClick = { navController.navigate(appcambio.tareas_horarios.route) }) // Azul oscuro
            TareaButton("Objetivos del día", Color(0xFF64B5F6),onClick = {  }) // Azul intermedio
            TareaButton("Notificaciones", Color(0xFF90CAF9),onClick = {  }) // Azul claro
            TareaButton("Trabajos a realizar", Color(0xFF90CAF1),onClick = {  }) // Botón deshabilitado
        }
    }
}


@Composable
fun TareaButton(text: String, backgroundColor: Color,
                onClick: () -> Unit
) {
    val buttonModifier = Modifier
        .fillMaxWidth()
        .height(70.dp)
        .padding(vertical = 6.dp)

    Button(
        onClick = onClick,

        modifier = buttonModifier,
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            disabledContainerColor = Color(0xFFE0E0E0), // Gris claro para deshabilitado
            disabledContentColor = Color.Gray
        )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = text,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            )
            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "Siguiente",
                tint = Color.White
            )
        }

    }
    Spacer(modifier = Modifier.height(26.dp))
}


@Preview
@Composable
fun preview_tareaas(){
    val navController = rememberNavController()
    Tareasxd(navController)
}