package app.nativesos.healthathansclient.home.ui.header

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.nativesos.healthathansclient.R


@Preview
@Composable
internal fun TopBarHome() {


    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(0.dp, 0.dp, 25.dp, 25.dp))
            .fillMaxWidth()

            .height(60.dp)
            .background(color = Color(0xFF009D9C))
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.End
            ) {
                Image(
                    modifier = Modifier
                        .padding(top = 5.dp, start = 10.dp)
                        .height(50.dp),
                    painter = painterResource(id = R.drawable.main_hospital_icon),
                    contentDescription = "Hospital Icon"
                )

            }



            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(8f)
                    .padding(start = 30.dp, bottom = 5.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(
                    modifier = Modifier.padding(end = 5.dp),
                    text = "Hospital Universitario Departamental de Nariño",
                    style = TextStyle(
                        fontSize = 17.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    ),
                    maxLines = 2,
                    textAlign = TextAlign.Center
                )

                Text(
                    text = "Paciente ID: 872347854",
                    style = TextStyle(
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 10.sp
                    ),
                    textAlign = TextAlign.Start
                )
            }

        }


    }

}