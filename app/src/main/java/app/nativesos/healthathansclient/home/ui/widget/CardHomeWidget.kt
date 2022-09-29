package app.nativesos.healthathansclient.home.ui.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.nativesos.healthathansclient.tools.WindowInfo
import app.nativesos.healthathansclient.tools.rememberWindowsInfo


@Composable
internal fun CardHome(doctor: Int) {

    val windowsInfo = rememberWindowsInfo()

    val isCompactWindows = windowsInfo.screenWidthInfo is WindowInfo.WindowType.Compact

    Card(
        modifier = Modifier
            .width(100.dp)
            .height(if (isCompactWindows) 60.dp else 150.dp),
        shape = RoundedCornerShape(10.dp),
        backgroundColor = Color(0XFFFFFFFF),
        elevation = 5.dp

    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(text = "Doctorname", style = TextStyle(fontSize = 9.sp, color = Color(0XFF009D9C), fontWeight = FontWeight.Bold))
          
           if(isCompactWindows) Spacer(modifier = Modifier.height(5.dp)) else Image(
                    modifier = Modifier.height(100.dp),
                    painter = painterResource(id = doctor),
                    contentDescription = "Doctor Name"
                )

            Text(text = "Ocupation",style = TextStyle(fontSize = 8.sp, color = Color(0XFF777777)))
            Text(text = "Status",style = TextStyle(fontSize = 9.sp))

        }


    }

}