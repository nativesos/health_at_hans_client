package app.nativesos.healthathansclient.login.ui

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import app.nativesos.healthathansclient.login.ui.body.BodyLogin
import app.nativesos.healthathansclient.login.ui.viewmodel.LoginViewModel
import app.nativesos.healthathansclient.ui.view.login.FooterLogin
import app.nativesos.healthathansclient.login.ui.header.HeaderLogin

@Composable
fun LoginScreen() {

    Scaffold(
        backgroundColor = Color(0xFFFFFFFF),

        topBar = {
            HeaderLogin()
        },
        bottomBar = {
            FooterLogin()
        },

        ) {

        // Lo correcto es hacer inyeccion de dependencias por este medio
        BodyLogin( LoginViewModel() )
    }

}













