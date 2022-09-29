package app.nativesos.healthathansclient.tools

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun rememberWindowsInfo(): WindowInfo {


    val configuration = LocalConfiguration.current

    return WindowInfo(
        screenWidthInfo =  when{
            configuration.screenWidthDp <= 320 -> WindowInfo.WindowType.Compact
            configuration.screenWidthDp < 400 -> WindowInfo.WindowType.Medium
            else -> WindowInfo.WindowType.Expanded
        },

        screenHeightInfo = when{
            configuration.screenHeightDp <= 480 -> WindowInfo.WindowType.Compact
            configuration.screenHeightDp < 640 -> WindowInfo.WindowType.Medium
            else -> WindowInfo.WindowType.Expanded
        },

        screenWidth = configuration.screenWidthDp.dp,
        screenHeight = configuration.screenHeightDp.dp
    )


}

data class WindowInfo(

    val screenWidthInfo: WindowType,
    val screenHeightInfo: WindowType,
    val screenWidth: Dp,
    val screenHeight: Dp,

    ){

    sealed class WindowType{

        object Compact: WindowType()
        object Medium: WindowType()
        object Expanded: WindowType()

    }

}