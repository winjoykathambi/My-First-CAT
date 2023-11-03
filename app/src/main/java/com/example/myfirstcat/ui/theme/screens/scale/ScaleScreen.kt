package com.example.myfirstcat.ui.theme.screens.scale

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myfirstcat.ui.theme.MyFirstCATTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaleScreen(navController: NavHostController){
    Text(text = "Welcome to scale page")

        var weight by remember { mutableStateOf(0f) }
        var height by remember { mutableStateOf(0f) }
        var bmi by remember { mutableStateOf(0f) }
        var smi by remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            TextField(
                value = weight.toString(),
                onValueChange = {
                    weight = it.toFloatOrNull() ?: 0f
                },
                label = { Text("Enter weight in kg") },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Decimal)
            )

            TextField(
                value = height.toString(),
                onValueChange = {
                    height = it.toFloatOrNull() ?: 0f
                },
                label = { Text("Enter height in meters") },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Decimal)
            )

            Button(
                onClick = {
                    bmi = weight / (height * height)
                    smi = calculateSMI(bmi)
                }
            ) {
                Text("Calculate BMI")
            }

            Text("BMI: $bmi")

            Text("SMI Index: $smi")
        }
    }

    private fun calculateSMI(bmi: Float): String {
        return when {
            bmi < 18.5 -> "Underweight"
            bmi < 24.9 -> "Normal Weight"
            bmi < 29.9 -> "Overweight"
            else -> "Obese"
        }
    }

@Preview(showBackground = true)
@Composable
fun ScaleScreenPreview(){
    MyFirstCATTheme {
        ScaleScreen(rememberNavController())
    }
}