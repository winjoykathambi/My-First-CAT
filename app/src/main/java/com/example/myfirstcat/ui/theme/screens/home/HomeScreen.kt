package com.example.myfirstcat.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myfirstcat.R
import com.example.myfirstcat.navigation.ROUTE_CALCULATOR
import com.example.myfirstcat.navigation.ROUTE_INTENT
import com.example.myfirstcat.navigation.ROUTE_SCALE
import com.example.myfirstcat.ui.theme.MyFirstCATTheme

@Composable
fun HomeScreen(navController: NavController){

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Text(
            text = "My Application",
            fontSize = 40.sp,
            modifier = Modifier
                .padding(start = 20.dp, top = 20.dp, bottom = 20.dp),
            color = Color.Blue,
            fontWeight = FontWeight.Bold)
        Column (modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .background(Color.White)
        )
        {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly ) {
                Card(modifier = Modifier
                    .width(165.dp)
                    .height(200.dp),
                    elevation = CardDefaults
                        .cardElevation(defaultElevation = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Green)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly) {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_calculate_24),
                                contentDescription = "My icon",
                                tint = Color.White)
                        }
                        Column(modifier = Modifier
                            .background(Color.White)
                            .fillMaxWidth()
                            .height(70.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {

                            Text(text = "Calculator")
                            Divider()
                            Text(text = "calculator App ")
                            Button(
                                onClick = {

                                    navController.navigate(ROUTE_CALCULATOR)
                                },
                                modifier = Modifier
                                    .padding(8.dp)
                                    .fillMaxWidth()
                            ) {
                                Text(text = "Calculator Button")
                            }

                        }
                    }
                }
                Card(modifier = Modifier
                    .width(165.dp)
                    .height(200.dp),
                    elevation = CardDefaults
                        .cardElevation(defaultElevation = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Magenta
                    )
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly) {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_toc_24)
                                , contentDescription = "My icon",
                                tint = Color.Black)
                        }
                        Column(modifier = Modifier
                            .background(Color.White)
                            .fillMaxWidth()
                            .height(70.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Text(text = "Intent")
                            Divider()
                            Text(text = "Intent Page")
                            Button(
                                onClick = {

                                    navController.navigate(ROUTE_INTENT)
                                },
                                modifier = Modifier
                                    .padding(8.dp)
                                    .fillMaxWidth()
                            ) {
                                Text(text = "Intent Button")
                            }

                        }
                    }
                }
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly ) {
                Card(modifier = Modifier
                    .width(165.dp)
                    .height(200.dp),
                    elevation = CardDefaults
                        .cardElevation(defaultElevation = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Yellow
                    )
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly) {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_calculate_24),
                                contentDescription = "My icon",
                                tint = Color.White)
                        }
                        Column(modifier = Modifier
                            .background(Color.White)
                            .fillMaxWidth()
                            .height(70.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Text(text = "BMI Calculator")
                            Divider()
                            Text(text = "Scale indexing ")
                            Button(
                                onClick = {

                                    navController.navigate(ROUTE_SCALE)
                                },
                                modifier = Modifier
                                    .padding(8.dp)
                                    .fillMaxWidth()
                            ) {
                                Text(text = "Scale Button")
                            }

                        }


                    }

                }

            }

        }

    }

}




@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    MyFirstCATTheme {
        HomeScreen(navController = rememberNavController())
    }
}


