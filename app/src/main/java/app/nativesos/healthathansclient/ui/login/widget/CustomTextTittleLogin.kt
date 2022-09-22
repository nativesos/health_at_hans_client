package app.nativesos.healthathansclient.ui.login.widget

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
internal fun TittleLoginText(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp)
    ) {

        Text(text = "Hola !", style = TextStyle(fontSize = 40.sp))

    }
}