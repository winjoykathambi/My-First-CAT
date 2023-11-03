package com.example.myfirstcat.ui.theme.screens.calculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
fun CalculatorScreen(navController: NavHostController){
    Text(text = "Welcome to calculator page")
        var num1 by remember { mutableStateOf(0f) }
        var num2 by remember { mutableStateOf(0f) }
        var result by remember { mutableStateOf(0f) }
        var operator by remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            TextField(
                value = num1.toString(),
                onValueChange = {
                    num1 = it.toFloatOrNull() ?: 0f
                },
                label = { Text("Enter number 1") },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
            )

            TextField(
                value = num2.toString(),
                onValueChange = {
                    num2 = it.toFloatOrNull() ?: 0f
                },
                label = { Text("Enter number 2") },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
            )

            Row {
                Button(onClick = { operator = "+" }) {
                    Text("+")
                }
                Button(onClick = { operator = "-" }) {
                    Text("-")
                }
                Button(onClick = { operator = "*" }) {
                    Text("*")
                }
                Button(onClick = { operator = "/" }) {
                    Text("/")
                }
            }

            Button(
                onClick = {
                    result = when (operator) {
                        "+" -> num1 + num2
                        "-" -> num1 - num2
                        "*" -> num1 * num2
                        "/" -> num1 / num2
                        else -> 0f
                    }
                }
            ) {
                Text("=")
            }

            Text("Result: $result")
        }
    }

@Preview(showBackground = true)
@Composable
fun CalculatorScreenPreview(){

    MyFirstCATTheme{
        CalculatorScreen(rememberNavController())

    }
}