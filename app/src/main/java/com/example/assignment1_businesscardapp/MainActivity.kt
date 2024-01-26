package com.example.assignment1_businesscardapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assignment1_businesscardapp.ui.theme.Assignment1_BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment1_BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}
@Composable
fun Logo(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
    ) {
        val image = painterResource(id = R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .background(color = Color.Blue)
        )
    }
}



@Composable
fun MainContainer(name: String, position: String, modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
    ) {
        Logo()
        Text(
            text = name,
            modifier = modifier
        )
        Text(
            text = position,
            modifier = modifier
        )
    }

}

@Composable
fun InfoContainer(modifier: Modifier = Modifier){
    Column(
        modifier = Modifier.padding(bottom = 50.dp)
    ) {
        DetailInfo(imageName = "phone", text = "825-288-2443")
        DetailInfo(imageName = "social", text = "@ji_wooona")
        DetailInfo(imageName = "email", text = "j.jwon339@mybvc.ca")
    }

}

@Composable
fun DetailInfo(imageName: String, text:String){
    Row(
    ){
        val image = when (imageName) {
            "email" -> painterResource(id = R.drawable.email)
            "phone" -> painterResource(id = R.drawable.phone)
            else -> painterResource(id = R.drawable.social)
        }
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(24.dp).padding(5.dp)
        )
            Text(
            text = text,
            modifier = Modifier.padding(start = 10.dp, bottom = 10.dp)
        )
    }

}
@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        MainContainer(name = "Jiwon Jeon", position = "Full Stack Developer")
        Spacer(modifier = Modifier.weight(1f))
        InfoContainer()
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment1_BusinessCardAppTheme {
        Greeting()
    }
}