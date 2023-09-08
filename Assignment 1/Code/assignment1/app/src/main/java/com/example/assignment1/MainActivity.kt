package com.example.assignment1

//21bce7618//
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent()
        {
            Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                LoginScreen()
            }
        }
    }
}

@Composable
fun LoginScreen()
{
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text="Login",style=MaterialTheme.typography.displayMedium)
        Spacer(modifier = Modifier.height(20.dp))

        simpleTextField1()
        Spacer(modifier = Modifier.height(6.dp))

        simpleTextField2()
        Spacer(modifier = Modifier.height(20.dp))
        simpleButton()
    }
}


@Composable
fun simpleButton()
{
    Button(modifier = Modifier.padding(16.dp),onClick={})
    {
        Text(text="Submit")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun simpleTextField1()
{
    var user by remember { mutableStateOf(TextFieldValue()) }
    TextField(value = user, onValueChange = {it -> user = it}, label = {Text(text = "Username")})
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun simpleTextField2()
{
    var pass by remember { mutableStateOf(TextFieldValue()) }
    TextField(value = pass, onValueChange = {it -> pass = it},label = {Text(text = "Password")})
}


