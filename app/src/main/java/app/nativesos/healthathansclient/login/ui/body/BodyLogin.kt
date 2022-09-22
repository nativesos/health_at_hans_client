package app.nativesos.healthathansclient.login.ui.body

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.nativesos.healthathansclient.login.ui.viewmodel.LoginViewModel
import app.nativesos.healthathansclient.login.ui.widgets.CustomLoginButton
import app.nativesos.healthathansclient.login.ui.widgets.IdTextLoginWidget
import app.nativesos.healthathansclient.login.ui.widgets.SearchClinic
import app.nativesos.healthathansclient.login.ui.widgets.CodeTextLoginWidget
import app.nativesos.healthathansclient.login.ui.widgets.TittleLoginText

@Composable
internal fun BodyLogin(loginViewModel: LoginViewModel) {

    val idPatient:String by loginViewModel.idPatient.observeAsState(initial = "")
    val tokenPatient: String by loginViewModel.tokenPatient.observeAsState(initial = "")
    val isValidData: Boolean by loginViewModel.isValidData.observeAsState(initial = false)

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

                IdTextLoginWidget(idPatient){
                    loginViewModel.onLoginChange(
                    idPatient = it,
                    tokenPatient = tokenPatient)
                }

                Spacer(modifier = Modifier.height(20.dp))

                CodeTextLoginWidget(tokenPatient){
                    loginViewModel.onLoginChange(
                        idPatient = idPatient,
                        tokenPatient = it,
                    )
                }
            }

        }

        Box(modifier = Modifier.fillMaxWidth()) {

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                /// Button for Iniciar sesion
                CustomLoginButton(isValidData)

                /// Link para verificar listado de hospitales
                SearchClinic()

            }
        }

    }

}