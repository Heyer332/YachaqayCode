package com.example.yachaqaycode

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.yachaqaycode.ui.theme.YachaqayCodeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            YachaqayCodeTheme {


                Appnevegation()
            }
        }
    }
}

@Preview(
    name = "Redmi Note 9 Pro",
    showBackground = true,
    device = "spec:shape=Normal,width=532,height=1040,unit=dp,dpi=400"
)
@Composable
fun Greeting() {
        Appnevegation()
}
@Composable
fun botones(navController: NavController) {
    NavigationBar(
        containerColor = Color( 0xFFA8F5F0)
    ) {
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Default.Home, contentDescription = "Home") },
            label = { Text("Inicio") },
            selected = false,
            onClick = { navController.navigate(route = appcambio.inicioxd.route) }
        )
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Buscar") },
            label = { Text("Buscar") },
            selected = false,
            onClick = { navController.navigate(appcambio.CursosScreen.route) }
        )
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Perfil") },
            label = { Text("Perfil") },
            selected = false,
            onClick = { /* Navega al perfil */ }
        )
    }
}

@Composable
fun retroceder(navController: NavController) {

    IconButton(
        onClick = {
            navController.popBackStack()  // Acción para retroceder a la pantalla anterior
        },
        modifier = Modifier.background(Color.Transparent) // Fondo transparente
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(100.dp))
        Icon(
            Icons.Default.ArrowBack,
            contentDescription = "Retroceder",

        )
    }
}
