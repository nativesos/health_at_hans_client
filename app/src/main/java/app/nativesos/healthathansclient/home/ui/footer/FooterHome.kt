package app.nativesos.healthathansclient.home.ui.footer

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.nativesos.healthathansclient.R
import app.nativesos.healthathansclient.home.ui.widget.CardHome

@Preview
@Composable
fun FooterHome(){

    val scrollState = rememberScrollState()

    Box(modifier = Modifier
        .padding(end = 5.dp, start = 5.dp, bottom = 10.dp, top = 5.dp)
    ) {
        Row(modifier = Modifier
            .horizontalScroll(scrollState)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            CardHome(R.drawable.doctor3_128)
            Spacer(modifier = Modifier.width(5.dp))
            CardHome(R.drawable.doctor2_128)
            Spacer(modifier = Modifier.width(5.dp))
            CardHome(R.drawable.doctor3_128)
            Spacer(modifier = Modifier.width(5.dp))
            CardHome(R.drawable.doctor1_128)
            Spacer(modifier = Modifier.width(5.dp))
            CardHome(R.drawable.doctor2_128)
        }
    }


}