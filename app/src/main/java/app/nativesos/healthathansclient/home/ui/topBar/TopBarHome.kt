package app.nativesos.healthathansclient.home.ui.topBar

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.nativesos.healthathansclient.R


@Preview
@Composable
internal fun TopBarHome() {

    Box(modifier = Modifier
        .clip(RoundedCornerShape(0.dp, 0.dp, 25.dp, 25.dp))
        .fillMaxWidth()
        .height(150.dp)
        .background(color = Color(0xFF009D9C))) {

        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Clinica Name",
                style = TextStyle(
                    fontSize = 30.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            )

            Image(modifier = Modifier.height(80.dp).padding(top = 10.dp), painter = painterResource(id =R.drawable.main_hospital_icon ), contentDescription = "Hospital Icon")

            Row(modifier = Modifier.fillMaxWidth().padding(start = 30.dp, top = 10.dp), verticalAlignment = Alignment.Bottom) {
                Text(text = "Codigo: 872347854", style = TextStyle(color = Color.White, fontWeight = FontWeight.Bold, fontSize = 12.sp))
            }
        }
        

    }

}