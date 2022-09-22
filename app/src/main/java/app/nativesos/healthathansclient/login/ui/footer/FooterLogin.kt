package app.nativesos.healthathansclient.ui.view.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
internal fun FooterLogin() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(30.dp)
            .padding(start = 20.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(text = "Desarrollado por", fontSize = 10.sp)

            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Native SoS.", fontSize = 10.sp)
            }

        }
    }

}


