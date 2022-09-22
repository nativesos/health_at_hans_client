package app.nativesos.healthathansclient.ui.view.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import app.nativesos.healthathansclient.R

@Composable
internal fun HeaderLogin() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, top = 30.dp),
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth(), horizontalArrangement = Arrangement.End
        ) {

            Column(horizontalAlignment = Alignment.End) {
                Text(
                    text = "Salud en sus",
                )
                Text(text = "Manos.")
            }

            Spacer(modifier = Modifier.width(10.dp))

            Box(
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.main_icon),
                    contentDescription = "Main Icon"
                )
            }

        }
    }

}