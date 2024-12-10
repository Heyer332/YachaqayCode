package com.example.yachaqaycode

sealed class appcambio(val route: String){
        object FondoPantalla : appcambio("login")
        object inicio_sesion : appcambio("inicio")
        object crear_cuenta : appcambio("crear")
        object CreaTuPerfilScreen : appcambio ("crear perfil")
        object selecionar_nivel : appcambio("selecion de nivel")
}
