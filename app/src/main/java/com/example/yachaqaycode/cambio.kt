package com.example.yachaqaycode

sealed class appcambio(val route: String){
        object FondoPantalla : appcambio("login")
        object inicio_sesion : appcambio("inicio")
}