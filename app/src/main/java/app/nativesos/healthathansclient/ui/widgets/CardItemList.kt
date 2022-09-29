package app.nativesos.healthathansclient.ui.widgets

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.nativesos.healthathansclient.R

@Preview
@Composable
fun CardItemList() {
//    startData: Unit, middleData:Unit, endData: Unit
    Box(modifier = Modifier
        .padding(all = 10.dp)
        .clip(shape = RoundedCornerShape(20.dp))
        .fillMaxWidth()
        .height(80.dp)
        .background(color = Color.LightGray)) {

        Row(modifier = Modifier
            .fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Column(modifier = Modifier.padding(start = 10.dp, top = 10.dp)) {
                Image(painter = painterResource(id = R.drawable.main_icon), contentDescription ="starticon" )
            }
            Column(
                modifier = Modifier.padding(top = 10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Title")
                Text(text = "Content")
            }
            Column(
                modifier = Modifier.padding(end = 10.dp, top = 10.dp)
            ) {
                Text(text = "date")
                Text(text = "Status")
            }

        }

    }


}