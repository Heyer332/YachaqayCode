package com.example.yachaqaycode

import android.provider.CalendarContract.Colors
import android.widget.Space
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
import androidx.navigation.NavController




@Composable
fun FondoPantalla(navController: NavController) {
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
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = { navController.navigate(route = appcambio.inicio_sesion.route) }
            ) {
                Text(text = "Iniciar sesión")
            }
            Spacer(modifier = Modifier.height(48.dp))

            Text(text = "Primera vez que ingresas?")
            Text(text = "Empieza a aprender hoy")

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { /* Acción para registrarse */ }
            ) {
                Text(text = "Registrate")
            }
        }
    }
}
