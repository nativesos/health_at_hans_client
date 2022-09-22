package app.nativesos.healthathansclient.ui.view.login

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(name = "Login Layout PReview")
@Composable
fun LoginView() {

    Scaffold(
        backgroundColor = Color(0xFFFFFFFF),

        topBar = {
            HeaderLogin()
        },
        bottomBar = {
            FooterLogin()
        },

        ) {

        BodyLogin()
    }

}













