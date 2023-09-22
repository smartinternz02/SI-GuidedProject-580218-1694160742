@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.assignment4

//21bce7618//
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.assignment4.ui.theme.SpotifyFont

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KFCMenuScreen(navController: NavController)
{
    BoxExample2()
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "KFC Menu",
            fontFamily= SpotifyFont,
            fontSize = 32.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(30.dp))

        Card(
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),

            )
        {
            Image(
                painter = painterResource(id = R.drawable.kfc1),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Column(modifier = Modifier.padding(10.dp))
            {
                Text(text = "Single Chicken Roll",
                    fontSize = 20.sp,
                    fontFamily= SpotifyFont,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier.padding(10.dp),
                )
                Text(text = "₹119",
                    fontSize = 20.sp,
                    fontFamily= SpotifyFont,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier.padding(10.dp),
                )
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Card(
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),

            )
        {
            Image(
                painter = painterResource(id = R.drawable.kfc2),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Column(modifier = Modifier.padding(10.dp))
            {
                Text(text = "Chicken Longer Burger & 2 Strips Combo",
                    fontSize = 20.sp,
                    fontFamily= SpotifyFont,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier.padding(10.dp),
                )
                Text(text = "₹219.05",
                    fontSize = 20.sp,
                    fontFamily= SpotifyFont,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier.padding(10.dp),
                )
            }
        }
        Spacer(modifier = Modifier.height(30.dp))

        Card(
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),

            )
        {
            Image(
                painter = painterResource(id = R.drawable.kfc3),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Column(modifier = Modifier.padding(10.dp))
            {
                Text(text = "Chocolate Lava Cake",
                    fontSize = 20.sp,
                    fontFamily= SpotifyFont,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier.padding(10.dp),
                )
                Text(text = "₹108.57",
                    fontSize = 20.sp,
                    fontFamily= SpotifyFont,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier.padding(10.dp),
                )
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun KFCPreview() {
    KFCMenuScreen(navController = rememberNavController())
}

