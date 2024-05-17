package com.example.clase_2_jectpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.LayoutIdParentData
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.clase_2_jectpack_compose.ui.theme.Clase_2_jectpack_composeTheme
import java.security.Principal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Clase_2_jectpack_composeTheme {
                // A surface container using the 'background' color from the theme
                /*
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }*/
            }
        }
    }

}
@Composable
fun Principal(){
   Box(modifier = Modifier.fillMaxSize()){
       Column(modifier=Modifier.fillMaxSize() ,
           verticalArrangement = Arrangement.SpaceBetween) {
           Row(modifier=Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
               Text("hola")
               Text("adios")
           }
           Row(modifier = Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.Center){
               Text()
           }
           Row(modifier=Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
               Text()
               Text()
           }
       }
   }
}

@Composable
fun Text(data:String="SSS") {
    Text(text="$data")
}
@Preview(showSystemUi = true , device = Devices.DEFAULT)
@Composable
private fun Main(){
    Principal()
}

/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
*/

//@Preview(showBackground = true)
/*@Composable
fun GreetingPreview() {
    Clase_2_jectpack_composeTheme {
        Greeting("Android")
    }
}*/