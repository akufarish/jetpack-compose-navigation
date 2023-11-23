package com.example.composer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import java.time.format.TextStyle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(navController: NavController) {
    var text by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var checkBox by remember {
        mutableStateOf(false)
    }

    val primary: Long = 0xFFa62c2b
    val secondary: Long = 0xFF9ca3af

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = "Background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                contentScale = ContentScale.Fit,
                modifier = Modifier.width(220.dp)
            )
            Card(
                colors = CardDefaults.cardColors(Color(0xFFffffff)),
                modifier = Modifier
                    .background(Color(0xFFffffff))
                    .padding(12.dp)
                    .width(280.dp)
            ) {
                Column (
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(7.dp)
                    ) {
                        Text(
                            text = "EMAIL",
                            fontSize = 18.sp,
                            color = Color(secondary)
                        )
                        OutlinedTextField(
                            value = text,
                            onValueChange = { text = it },
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                focusedBorderColor = Color(primary),
                                unfocusedBorderColor = Color(secondary),
                            ),
                            textStyle = LocalTextStyle.current.copy(
                                fontSize = 12.sp,
                            ),
                            modifier = Modifier
                                .background(Color(0xFFf3f4f6))
                                .height(40.dp)
                                .defaultMinSize(minHeight = 40.dp)
                        )
                    }
                    Column(
                        verticalArrangement = Arrangement.spacedBy(7.dp)
                    ) {
                        Text(
                            text = "PASSWORD",
                            fontSize = 18.sp,
                            color = Color(secondary)
                        )
                        OutlinedTextField(
                            value = password,
                            singleLine = true,
                            onValueChange = { password = it },
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                focusedBorderColor = Color(primary),
                                unfocusedBorderColor = Color(secondary),
                            ),
                            visualTransformation = PasswordVisualTransformation(),
                            modifier = Modifier
                                .background(Color(0xFFf3f4f6))
                                .height(40.dp)
                        )
                    }
                    Row {
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(Color(primary)),
                            shape = RoundedCornerShape(12)
                        ) {
                            Text(text = "Login")
                        }
                        TextButton(
                            onClick = {},
                        ) {
                            Text(
                                text = "Lupa Password?",
                                color = Color(secondary)
                            )
                        }
                    }
                    Row(
                        modifier = Modifier
                            .width(280.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Checkbox(
                                checked = checkBox,
                                onCheckedChange = {checkBox = it},
                                colors = CheckboxDefaults.colors(Color(primary))
                            )
                            Text(text = "Remember Me?")
                        }

                        TextButton(
                            onClick =   {
                                      navController.navigate(Screen.Register.route)
                            },
                        ) {
                            Text(
                                text = "DAFTAR",
                                color = Color(secondary)
                            )
                        }
                    }
                }
            }

            Text(
                text = "DINAS KEBUDAYAAN DAN PARIWISATA PROVINSI KALIMANTAN TENGAH",
                textAlign = TextAlign.Center,
                color = Color(0xFF6b7280),
                modifier = Modifier
                    .padding(top = 40.dp)
            )
        }
    }
}