package app.nativesos.healthathansclient.ui.widgets.footer

import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import app.nativesos.healthathansclient.R


@Composable
fun ReturnToHome(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color(0XFF009D9C))
        .padding(start = 10.dp)
        .height(50.dp),
        verticalAlignment = Alignment.CenterVertically
        ) {

        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .height(30.dp)
                .width(30.dp),){
           Image( painter = painterResource(id = R.drawable.ic_back_24), contentDescription = "backIcon")
        }

    }
}