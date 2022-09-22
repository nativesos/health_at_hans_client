package app.nativesos.healthathansclient.ui.view.login

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.nativesos.healthathansclient.ui.login.widget.CustomLoginButton
import app.nativesos.healthathansclient.ui.login.widget.DocumentLoginOutlineText
import app.nativesos.healthathansclient.ui.login.widget.SearchClinic
import app.nativesos.healthathansclient.ui.login.widget.SecureCodeLoginOutlinedText
import app.nativesos.healthathansclient.ui.login.widget.TittleLoginText

@Composable
internal fun BodyLogin() {

    var documentNumber by remember { mutableStateOf("") }
    val scrollState = rememberScrollState()


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(bottom = 100.dp, end = 40.dp, start = 40.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.SpaceAround,

        ) {

        // Saludo del contenido
        TittleLoginText()

        /// Text labels para inciar sesion
        Box(modifier = Modifier.fillMaxWidth()) {

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                DocumentLoginOutlineText(documentNumber) { documentNumber = it }

                Spacer(modifier = Modifier.height(20.dp))

                SecureCodeLoginOutlinedText()
            }

        }

        Box(modifier = Modifier.fillMaxWidth()) {

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                /// Button for Iniciar sesion
                CustomLoginButton()

                /// Link para verificar listado de hospitales
                SearchClinic()

            }
        }

    }

}