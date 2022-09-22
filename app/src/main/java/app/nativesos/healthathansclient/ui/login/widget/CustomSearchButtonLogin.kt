package app.nativesos.healthathansclient.ui.login.widget

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

@Composable
internal fun SearchClinic(){
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(text = "Verifique su clinica")
        TextButton(onClick = { /*TODO*/ }) {
            Text("Buscar")
        }
    }
}