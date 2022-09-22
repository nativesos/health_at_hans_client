package app.nativesos.healthathansclient.home.ui

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import app.nativesos.healthathansclient.home.ui.topBar.TopBarHome


@Preview
@Composable
fun HomeView(){
    Scaffold(
        backgroundColor = Color(0xFFFFFFFF),
        topBar = {TopBarHome()},

        ) {




    }


}