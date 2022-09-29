package app.nativesos.healthathansclient.home.ui

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import app.nativesos.healthathansclient.home.ui.body.BodyHome
import app.nativesos.healthathansclient.home.ui.footer.FooterHome
import app.nativesos.healthathansclient.home.ui.header.TopBarHome


@Preview(device = Devices.PIXEL_2 )
@Composable
fun HomeView(){
    Scaffold(
        backgroundColor = Color(0xFFFFFFFF),
        topBar = {TopBarHome()},
        bottomBar = { FooterHome() }
    ) {

        BodyHome()

    }


}