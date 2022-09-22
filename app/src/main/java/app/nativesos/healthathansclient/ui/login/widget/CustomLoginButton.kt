package app.nativesos.healthathansclient.ui.login.widget

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
internal fun CustomLoginButton(){


    Button(modifier = Modifier.fillMaxWidth(), onClick = { /*TODO*/ }) {
        Text(text = "Login")
    }


}
