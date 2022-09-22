package app.nativesos.healthathansclient

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import app.nativesos.healthathansclient.home.ui.HomeView
import app.nativesos.healthathansclient.login.ui.LoginScreen


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {

            HomeView()

        }
    }
}

@Composable
fun Greeting(name: String) {
    HomeView()

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting("Android")
}


