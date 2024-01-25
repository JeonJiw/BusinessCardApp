package com.example.assignment1_businesscardapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
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
                    Greeting("Business Card App")
                }
            }
        }
    }
}
@Composable
fun Logo(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.android_logo)
    Image(
        painter = image,
        contentDescription = null,
    )
    Text(
        text = "android",
        modifier = modifier
    )
}


@Composable
fun MainContainer(name: String, position: String, modifier: Modifier = Modifier){
    Column {
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
    Column {
//        DetailInfo(imageName = "phone", text = "825-288-2443", modifier)
//        DetailInfo(imageName = "socialId", text = "@ji_wooona", modifier)
//        DetailInfo(imageName = "email", text = "j.jwon339@mybvc.ca", modifier)
        DetailInfo(imageName = "phone", text = "825-288-2443", modifier)
        DetailInfo(imageName = "socialId", text = "@ji_wooona", modifier)
        DetailInfo(imageName = "email", text = "j.jwon339@mybvc.ca", modifier)
    }

}

@Composable
fun DetailInfo(imageName: String, text:String, modifier: Modifier){

//        var image = painterResource(id = R.drawable.android_logo)
//        Image(
//            painter = image,
//            contentDescription = null,
//        )
    Row{
        Text(
            text = imageName,

        )
        Text(
            text = text,
            modifier = Modifier
        )
    }

}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        MainContainer(name = "Jiwon Jeon", position = "Full Stack Developer")
        InfoContainer()
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment1_BusinessCardAppTheme {
        Greeting("Android")
    }
}