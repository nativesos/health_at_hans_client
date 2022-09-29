package app.nativesos.healthathansclient.ui.widgets.header

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import app.nativesos.healthathansclient.R

@Composable
fun SearchHeader() {

    var searchText by remember { mutableStateOf("") }
    val lightBlue = Color(0xffd8e6ff)

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .background(color = Color(0XFF009D9C)),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Spacer(modifier = Modifier.width(10.dp))

        TextField(

            modifier = Modifier
                .clip(shape = RoundedCornerShape(20.dp))
                .width(250.dp)
                .background(color = Color(0XFFE3E3E3)),

            value = searchText, onValueChange = { searchText = it },

            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = lightBlue,
                cursorColor = Color.Black,
                disabledLabelColor = lightBlue,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            maxLines = 1
        )
        Spacer(modifier = Modifier.width(10.dp))

        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .height(30.dp)
                .width(30.dp),){
            Image(
                modifier = Modifier.height(40.dp).width(40.dp),
                painter = painterResource(id = R.drawable.ic_search_24), contentDescription = "search")
        }




    }


}