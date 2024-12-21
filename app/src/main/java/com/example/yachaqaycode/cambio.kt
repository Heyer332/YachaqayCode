package com.example.yachaqaycode

sealed class appcambio(val route: String){
        object FondoPantalla : appcambio("login")
        object inicio_sesion : appcambio("inicio")
        object crear_cuenta : appcambio("crear")
        object CreaTuPerfilScreen : appcambio ("crear perfil")
        object selecionar_nivel : appcambio("selecion de nivel")

        //inicio
        object inicioxd : appcambio("inicioxdd")

        //introduccion
        object PantallaIntroduccion : appcambio("introducion uno")
        object PantallaIntroduccion_2 : appcambio("introduccion 2")
        object PantallaIntroduccion_3 : appcambio("introduccion 3")
        //cursos
        object CursosScreen : appcambio("cursosxd")
        object Cursos_intro : appcambio("cursos_2")

        //tareas
        object Tareasxd : appcambio("tareas inicio")
        object tareas_horarios : appcambio("horarios")
}
