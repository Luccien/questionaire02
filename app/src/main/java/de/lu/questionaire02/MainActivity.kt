package de.lu.questionaire02


import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import de.lu.questionaire02.ui.theme.Questionaire02Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Questionaire02Theme {
                // A surface container using the 'background' color from the theme
                /*Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {*/
                       StartScreen()

                    //}
                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun StartScreen(modifier: Modifier = Modifier) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.fillMaxSize()
        )
        {

            TopMenu()
            MiddleMenu()
        }
    }




@Composable
fun TopMenu(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        //modifier = modifier.fillMaxSize() // this will cause error with following elements
        )
    {
    Image(
        painter = painterResource(id = R.drawable.p1food ),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(88.dp)
            .clip(CircleShape)
    )
    Text(
        stringResource(id = R.string.windPower),
        //style = MaterialTheme.typography.h3,
        modifier = Modifier
            .paddingFromBaseline(top = 24.dp, bottom = 8.dp)
    )

}

}


@Composable
fun MiddleMenu(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        //modifier = modifier.fillMaxSize()
    ) {
        Surface(
            shape = MaterialTheme.shapes.small,
            modifier = Modifier.fillMaxSize()
        ) {
            Row (Modifier.width(192.dp)){
                Image(
                    painter = painterResource(id = R.drawable.p1),
                    contentScale = ContentScale.Crop,
                    contentDescription = null,
                    modifier = Modifier
                            .size(56.dp)
                )
                Text(
                    stringResource(id = R.string.windPower)
                )
            }

        }
    }
}


