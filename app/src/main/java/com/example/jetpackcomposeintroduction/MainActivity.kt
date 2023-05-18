package com.example.jetpackcomposeintroduction

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeintroduction.ui.theme.JetpackComposeIntroductionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       setContent {
           UserCard()
       }
    }
}

@Composable
fun UserCard(){
    val context = LocalContext.current
    Row(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
        .padding(10.dp)
        .border(1.dp, color = Color.Cyan)
        .padding(5.dp)
        ) {
        Image(painter = painterResource(id =R.drawable.ic_launcher_background),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
             )
        Column {
            Text(text = "Sample Text to display here!!!")
            Button(onClick = {
                Toast.makeText(context, "Button Clicked!!", Toast.LENGTH_SHORT).show()
            }) {
               Text(text = "Button")
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun showPreview(){

        UserCard()


}



