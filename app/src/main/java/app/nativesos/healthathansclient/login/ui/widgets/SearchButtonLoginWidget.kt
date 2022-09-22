package app.nativesos.healthathansclient.login.ui.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight

@Composable
internal fun SearchClinic(){
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(text = "Verifique su clinica")
        TextButton(onClick = { /*TODO*/ }) {
            Text("Buscar", style = TextStyle(color = Color(0xFF009D9C), fontWeight = FontWeight.Bold))
        }
    }
}