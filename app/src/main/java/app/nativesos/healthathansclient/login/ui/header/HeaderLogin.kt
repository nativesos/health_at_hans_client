package app.nativesos.healthathansclient.login.ui.header

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.nativesos.healthathansclient.R

@Preview
@Composable
internal fun HeaderLogin() {

    val headerTextStyle = TextStyle(color = Color(0xFF343341), fontSize = 20.sp, fontWeight = FontWeight.Bold)

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, top = 30.dp),
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth(), horizontalArrangement = Arrangement.End
        ) {

            Column(horizontalAlignment = Alignment.End, verticalArrangement = Arrangement.Center) {
                Text(
                    text = "Salud en sus", style = headerTextStyle
                )
                Text(text = "Manos.", style = headerTextStyle)
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