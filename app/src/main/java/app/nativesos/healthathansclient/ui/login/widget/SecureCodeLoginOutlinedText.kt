package app.nativesos.healthathansclient.ui.login.widget

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

@Composable
internal fun SecureCodeLoginOutlinedText(){

    var privateCode by remember { mutableStateOf("") }
    val isAccessCodeVisible by remember { mutableStateOf(false) }

    OutlinedTextField(
        maxLines = 1,
        modifier = Modifier.fillMaxWidth(),
        value = privateCode,
        label = { Text(text = "Codigo de acceso") },
        placeholder = { Text(text = "Codigo") },
        visualTransformation = if (isAccessCodeVisible) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.Lock,
                contentDescription = "access code icon"
            )
        },
        onValueChange = { privateCode = it },
    )

}