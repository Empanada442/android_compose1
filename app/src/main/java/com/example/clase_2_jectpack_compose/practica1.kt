package com.example.clase_2_jectpack_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.unit.dp

@Composable
fun Componente2() {
    Text(text = "Azul")
}

@Composable
fun Cajita1() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                //caja de arriba a la izquierda
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Red)
                )
                // caja de arriba a la derecha
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Green)
                )
            }
            // Caja del centro
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(11f),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.Blue),
                ) {
                    Componente2()
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Cyan)
                )

                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Magenta)
                )
            }
        }
    }
}

@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
private fun Main() {
    Cajita1()
}