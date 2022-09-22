package app.nativesos.healthathansclient.login.ui.widgets

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import app.nativesos.healthathansclient.login.ui.viewmodel.LoginViewModel

@Composable
internal fun IdTextLoginWidget(idPatient: String, onChanged: (String)-> Unit ){

    OutlinedTextField(
        maxLines = 1,
        modifier = Modifier.fillMaxWidth(),
        value = idPatient,
        label = { Text(text = "Numero de cedula") },
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.AccountBox,
                contentDescription = "account icon"
            )
        },
        onValueChange = {
            onChanged(it)
        })

}



