package app.nativesos.healthathansclient.login.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight

@Composable
internal fun CustomLoginButton(isButtonActive: Boolean){


    Button(

        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFF009D9C)),
        enabled = isButtonActive,
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xFF009D9C),
            disabledBackgroundColor = Color(0xFF009D9C),
        )

    ) {

        Text(text = "Log in", style = TextStyle(fontWeight = FontWeight.Bold, color = Color.White),)
    }


}
