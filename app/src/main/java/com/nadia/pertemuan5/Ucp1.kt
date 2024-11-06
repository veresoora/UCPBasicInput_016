package com.nadia.pertemuan5

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRowScopeInstance.weight
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nadia.pertemuan5.R

@Preview(showBackground = true)
@Composable
fun InputData(modifier: Modifier = Modifier) {
    var orgtext by remember { mutableStateOf("") }
    var dprtext by remember { mutableStateOf("") }
    var arrtext by remember { mutableStateOf("") }
    var tsptext by remember { mutableStateOf("") }

    val listtsp = listOf("Bus", "Ship", "Train", "Plane")

    var org by remember { mutableStateOf("") }
    var dpr by remember { mutableStateOf("") }
    var arr by remember { mutableStateOf("") }
    var tsp by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        Header()
        ElevatedCard(
            colors = CardDefaults.cardColors(containerColor = Color.White),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp)
        ) {
            Text(
                text = "Plan Your Adventures",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(text = "Let's plan an exquite adventure")
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth().padding(top = 15.dp, start = 10.dp, end = 10.dp),
                value = orgtext,
                onValueChange = { orgtext = it },
                label = {
                    Text("Origin")
                },
                placeholder = {
                    Text("Your origin")
                },
                shape = RoundedCornerShape(40.dp),
            )
            Box {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth().padding(end = 15.dp)
                ) {
                    Box{
                        OutlinedTextField(
                            modifier = Modifier.fillMaxWidth()
                                .padding(top = 15.dp, start = 10.dp, end = 10.dp),


                            value = dprtext,
                            onValueChange = { dprtext = it },
                            label = {
                                Text("Departure")
                            },
                            placeholder = {
                                Text("Your Departure")
                            },
                            shape = RoundedCornerShape(40.dp),
                        )
                        OutlinedTextField(
                            modifier = Modifier.fillMaxWidth()
                                .padding( start = 10.dp, end = 10.dp),
                            value = arrtext,
                            onValueChange = { arrtext = it },
                            label = {
                                Text("Arrival")
                            },
                            placeholder = {
                                Text("Your Arrival")
                            },
                            shape = RoundedCornerShape(40.dp),
                        )

                    }
                }
            }
            ElevatedCard() {
                ElevatedCard() { }
            }

            Button(
                onClick = {
                    
                }
            ) {
                Text("Submit")
            }

            ElevatedCard(colors = CardDefaults.cardColors(containerColor = Color.LightGray),
                modifier = Modifier
                    .fillMaxWidth()) {
                Data(judul = "Origin", isinya = org)
                Data(judul = "Departure", isinya = dpr)
            }
            ElevatedCard(colors = CardDefaults.cardColors(containerColor = Color.LightGray),
                modifier = Modifier
                    .fillMaxWidth()) {
                Data(judul = "Arrival", isinya = arr)
                Data(judul = "Transport", isinya = tsp)
            }
        }
    }
}

@Composable
fun Data(judul: String, isinya: String) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = judul,
                modifier = Modifier.weight(1.2f))

            Text(text = ":",
                modifier = Modifier.weight(0.2f))

            Text(text = isinya,
                modifier = Modifier.weight(2f))

        }
    }
}

@Composable
fun Header() {
    Box() {
        Row(modifier = Modifier.fillMaxWidth().background(color = Color.Blue)) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.nadia),
                    contentDescription = "profile",
                    modifier = Modifier.size(80.dp)
                        .clip(CircleShape)
                )
                Row(
                    modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "person",
                        tint = Color.White
                    )
                    Text(
                        text = "Nadia Muna Haliza",
                        color = Color.White
                    )
                }

                Row(
                    modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Filled.LocationOn,
                        contentDescription = "Loc",
                        tint = Color.White
                    )
                    Text(
                        text = "Yogyakarta",
                        color = Color.White
                    )
                }

            }
        }
    }
}