package app.nativesos.healthathansclient.ui.login.widget

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
internal fun DocumentLoginOutlineText( document: String, onChanged: (String) -> Unit ){

    OutlinedTextField(
        maxLines = 1,
        modifier = Modifier.fillMaxWidth(),
        value = document,
        label = { Text(text = "Numero de cedula") },
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.AccountBox,
                contentDescription = "account icon"
            )
        },
        onValueChange = {onChanged(it)})
}

