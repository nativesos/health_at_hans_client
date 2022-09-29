package app.nativesos.healthathansclient

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.Display
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import app.nativesos.healthathansclient.home.ui.HomeView
import app.nativesos.healthathansclient.login.ui.LoginScreen
import app.nativesos.healthathansclient.medicalservice.ui.MedicalServiceScreen


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        /// Verticar Orientation per defailt
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)

        setContent {

            //HomeView()
            MedicalServiceScreen()

        }
    }
}

@Composable
fun Greeting() {
    //HomeView()
    MedicalServiceScreen()

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting()
}


