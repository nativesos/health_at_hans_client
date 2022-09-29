package app.nativesos.healthathansclient.home.ui.body

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.nativesos.healthathansclient.R
import app.nativesos.healthathansclient.tools.WindowInfo
import app.nativesos.healthathansclient.tools.rememberWindowsInfo

@Preview(device = Devices.PIXEL_2 )
@Composable
internal fun BodyHome() {
    val windowsInfo = rememberWindowsInfo()

    val isCompactWindows = windowsInfo.screenWidthInfo is WindowInfo.WindowType.Expanded


    val scrollState = rememberScrollState()

    val patient = "Jhnatan Ortiz Cabezas"
    val hourAppoiment = "2:20 pm"
    val addressAppoiment = "Consultorio 205 avenida las palmas"
    val doctor = "O'coro Jhon Alexander"
    val statusAppoiment = "Pendiente"
    val dateAppoiment = "19 / 09 /2022"

    val colorAppoiment = if (statusAppoiment.equals("Pendiente")) Color.Blue
    else if (statusAppoiment.equals("Perdida")) Color.Red
    else Color.Green



    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.Top

    ) {

        /** Client name and Settings button **/
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, top = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = patient,
                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
            )
            Image(
                modifier = Modifier
                    .height(24.dp)
                    .width(24.dp),
                painter = painterResource(id = R.drawable.settings_24),
                contentDescription = "settings"
            )
        }


        /**  Caja de infromacion de citas para el paciente  **/
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(end = 10.dp, start = 10.dp)
            .height(90.dp)
            .defaultMinSize(minHeight = 80.dp)) {
            Card(
                modifier = Modifier
                    .border(border = BorderStroke(1.dp, color = colorAppoiment))
                    .height(90.dp),
                elevation = 10.dp
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .verticalScroll(scrollState)
                        .padding(all = 5.dp),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Center
                ) {

                    Text(text = "Doctor: $doctor")
                    Text(text = "$hourAppoiment, $addressAppoiment")


                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(text = dateAppoiment)

                        Text(
                            text = statusAppoiment,
                            style = TextStyle(
                                color = colorAppoiment,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }


                }

            }
        }


        if(isCompactWindows) Spacer(modifier = Modifier.height(50.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(end = 10.dp, start = 10.dp, bottom = 5.dp, top = 10.dp),
            horizontalArrangement = Arrangement.Center
        ) {


            BoxInformation(
                modifier = Modifier
                    .defaultMinSize(minHeight = 100.dp, minWidth = 100.dp)
                    .height(110.dp)
                    .width(150.dp)
                    .border(border = BorderStroke(1.dp, color = Color(0XFFFFFFFF))),
                R.drawable.appoiment_64,
                "100",
                "Citas Medicas",
                "Permite ver todas tus citas hasta la fecha"
            )

            Spacer(modifier = Modifier.width(10.dp))

            BoxInformation(
                modifier = Modifier
                    .defaultMinSize(minHeight = 100.dp, minWidth = 100.dp)
                    .height(110.dp)
                    .width(150.dp)
                    .border(border = BorderStroke(1.dp, color = Color(0XFFFFFFFF))),
                R.drawable.add_64,
                "",
                "Nueva Citas",
                "Permite agendar una nueva cita medica."
            )


        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(end = 10.dp, start = 10.dp, top = 5.dp),
            horizontalArrangement = Arrangement.Center
        ) {

            BoxInformation(
                modifier = Modifier
                    .defaultMinSize(minHeight = 100.dp, minWidth = 100.dp)
                    .height(110.dp)
                    .width(150.dp)
                    .border(border = BorderStroke(1.dp, color = Color(0XFFFFFFFF))),
                R.drawable.stethoscope_64,
                "40",
                "Tratamientos",
                "Permite ver los tratamientos medicos"
            )

            Spacer(modifier = Modifier.width(10.dp))

            BoxInformation(
                modifier = Modifier
                    .defaultMinSize(minHeight = 100.dp, minWidth = 100.dp)
                    .height(110.dp)
                    .width(150.dp)
                    .border(border = BorderStroke(1.dp, color = Color(0XFFFFFFFF))),
                R.drawable.change_64,
                "",
                "Cambios - Reportes",
                "Cambio de clinicas y envio de historial medico"
            )
        }



        /** Footer bar for Medichal availables **/
       //FooterHome()


    }


}

@Composable
private fun BoxInformation(modifier: Modifier,icon: Int,quantity: String, tittle: String, Specification: String) {


    Card(
        modifier = modifier.background(color = Color(0XFFFFFFFF)),
        elevation = 5.dp
    ) {

        Column(
            modifier = Modifier.padding(all = 5.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = if(quantity != "") Arrangement.SpaceAround else Arrangement.Center ) {

                Image(
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp),
                    painter = painterResource(id = icon),
                    contentDescription = "Main Icon"
                )
                Spacer(modifier = Modifier.padding(top = 20.dp))
                if(!quantity.equals("")) Text(text = quantity, style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color(0XFF009D9C)))

            }

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(2f)
                    .padding(start = 10.dp)
                    .verticalScroll(rememberScrollState())
                    .weight(1f)
                ,
                verticalArrangement = Arrangement.Center) {
                Text(text = tittle, style = TextStyle(color = Color(0XFF009D9C), fontWeight = FontWeight.Bold))
                Text(text = Specification, style = TextStyle(fontSize = 10.sp, color = Color(0XFF777777), fontWeight = FontWeight.Bold))

            }


        }

    }
}