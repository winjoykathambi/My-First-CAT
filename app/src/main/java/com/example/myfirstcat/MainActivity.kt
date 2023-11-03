//Create an android app with 4 screens
//on the first screen, design a beautiful card dashboard which one can use
//to navigate on to the other 3 screens
//On the second screen, design a calculator that can perform the four primary arithmetic
//operations on any two numbers provided by the user as input
//On the third screen, demonstrate all the 6 intents learnt in class
//On the fourth screen, design a proper BMI calc, using a proper SMI index scale.
//You can google the index scale.
//Make sure your code is backend up on github.
package com.example.myfirstcat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstcat.navigation.AppNavHost
import com.example.myfirstcat.ui.theme.MyFirstCATTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstCATTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavHost()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstCATTheme {
        AppNavHost()
    }
}