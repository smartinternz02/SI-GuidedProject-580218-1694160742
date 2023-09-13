@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.assignment3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment3.ui.theme.RobotoFont
import com.example.assignment3.ui.theme.SpotifyFont


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppContent()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyAppContent() {
    val context = LocalContext.current
    var url = ""
    BoxExample()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Spacer(modifier = Modifier.height(60.dp))
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Text(
            text = "LOG-IN",
            fontFamily= SpotifyFont,
            fontSize = 45.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(50.dp))

        OutlinedTextField(
            label = { Text("Enter Email", fontFamily = SpotifyFont) },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Done
            ),
            value = username,
            onValueChange = { newUsername -> username = newUsername },
        )

        OutlinedTextField(
            label = { Text("Enter Password", fontFamily = SpotifyFont) },
            value = password,
            onValueChange = { newPassword -> password = newPassword },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            )
        )
        Spacer(modifier = Modifier.height(50.dp))

        val selectedWeb = remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxWidth()
        )
        {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            )
            {
                RadioButton(
                    selected = selectedWeb.value == Websites.amzn,
                    onClick = {
                        selectedWeb.value = Websites.amzn
                    }
                )
                Text(Websites.amzn, fontFamily = RobotoFont)


                RadioButton(selected = selectedWeb.value == Websites.fb,
                    onClick = {
                        selectedWeb.value = Websites.fb
                    })
                Text(Websites.fb, fontFamily = RobotoFont)


                RadioButton(selected = selectedWeb.value == Websites.ggl,
                    onClick = {
                        selectedWeb.value = Websites.ggl
                    })
                Text(Websites.ggl, fontFamily = RobotoFont)


                RadioButton(selected = selectedWeb.value == Websites.yt,
                    onClick = {
                        selectedWeb.value = Websites.yt
                    })
                Text(Websites.yt, fontFamily = RobotoFont)
            }
        }
        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick =
            {
                if (selectedWeb.value == "Amazon") {
                    url = "https://www.amazon.in"
                } else if (selectedWeb.value == "Facebook") {
                    url = "https://www.facebook.com"

                } else if (selectedWeb.value == "Google") {
                    url = "https://www.google.com"

                } else if (selectedWeb.value == "YouTube") {
                    url = "https://www.youtube.com"
                }
                context.startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse(url)
                    )
                )
            },
            modifier = Modifier.padding(all = 10.dp)
        )
        {
            Text(
                text = "SIGN IN",
                fontFamily = SpotifyFont
            )
        }
    }
}
object Websites
{
    const val amzn = "Amazon"
    const val fb = "Facebook"
    const val ggl = "Google"
    const val yt = "YouTube"
}

@Composable
fun BoxExample() {
    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.bg),
                modifier = Modifier.fillMaxSize(),
                contentDescription = "Background Image",
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    MyAppContent()
}