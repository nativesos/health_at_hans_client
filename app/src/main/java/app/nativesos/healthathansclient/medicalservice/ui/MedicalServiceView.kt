package app.nativesos.healthathansclient.medicalservice.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.nativesos.healthathansclient.ui.widgets.CardItemList
import app.nativesos.healthathansclient.ui.widgets.footer.ReturnToHome
import app.nativesos.healthathansclient.ui.widgets.header.SearchHeader


@Preview
@Composable
fun MedicalServiceScreen() {

    Scaffold(
        topBar = { SearchHeader() },
        bottomBar = { ReturnToHome() }
    ) {

        Column(
            modifier = Modifier
                .padding(bottom = 50.dp)
                .verticalScroll(rememberScrollState())
                .padding(top = 10.dp)
        ) {
            CardItemList()
            CardItemList()
            CardItemList()
            CardItemList()
            CardItemList()
            CardItemList()
            CardItemList()
            CardItemList()
            CardItemList()
            CardItemList()
            CardItemList()
            CardItemList()
            CardItemList()
            CardItemList()


        }


    }

}