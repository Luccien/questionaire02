package de.lu.questionaire02


import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import de.lu.questionaire02.ui.theme.Questionaire02Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Questionaire02Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Gray//MaterialTheme.colors.col
                ) {
                       StartScreen()

                    }
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
            TopMenuLazyRow()
            MiddleMenuLazyGridRow()// TODO 45 minutes on video
        //TopMenu(drawable = R.drawable.p1food, text = R.string.windPower)
            //MiddleMenu(drawable = R.drawable.p1plastic, text = R.string.windPower)
        }
    }

private val topMenuData = listOf(
    R.drawable.p1plastic to R.string.Plastic,
    R.drawable.p1food to R.string.food,
    //R.drawable.basicincome to R.string.basicIncome,
    R.drawable.p1climatewarming to R.string.climateWarming,
    R.drawable.p1humanrights to R.string.humanrights,
    R.drawable.p1desertification to R.string.desertification,
    R.drawable.p1recycling to R.string.recycling,
    R.drawable.p1trees to R.string.Trees,
    R.drawable.p1water to R.string.water,
    R.drawable.p1windpower to R.string.windPower
).map{DrawableStringPair(it.first, it.second)}

private val middleMenuData = listOf(
    R.drawable.p1plastic to R.string.Plastic,
    R.drawable.p1food to R.string.food,
    //R.drawable.basicincome to R.string.basicIncome,
    R.drawable.p1climatewarming to R.string.climateWarming,
    R.drawable.p1humanrights to R.string.humanrights,
    R.drawable.p1desertification to R.string.desertification,
    R.drawable.p1recycling to R.string.recycling,
    R.drawable.p1trees to R.string.Trees,
    R.drawable.p1water to R.string.water,
    R.drawable.p1windpower to R.string.windPower
).map{DrawableStringPair(it.first, it.second)}





@Composable
fun TopMenuLazyRow(
    modifier: Modifier = Modifier
){
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier)
    {
        items(topMenuData){item->
            TopMenuItem(drawable = item.drawable, text = item.text)
        }
    }

}

@Composable
fun TopMenuItem(@DrawableRes drawable: Int,
            @StringRes text: Int,
            modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        //modifier = modifier.fillMaxSize() // this will cause error with following elements
        )
    {
    Image(
        painter = painterResource(id = drawable),//R.drawable.p1food ),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(88.dp)
            .clip(CircleShape)
    )
    Text(
        stringResource(id = text),//R.string.windPower),
        //style = MaterialTheme.typography.h3,
        modifier = Modifier
            .paddingFromBaseline(top = 24.dp, bottom = 8.dp)
    )
}
}


@Composable
fun HomeSection(
    @StringRes title: Int,
    modifier: Modifier = Modifier,
    content: @Composable ()-> Unit
){
    Column(modifier){
        Text( stringResource(id = title))
        content()
    }

}



@Composable
fun MiddleMenuLazyGridRow(){


    //middleMenuData
}


@Composable
fun MiddleMenuItem(
    @DrawableRes drawable: Int,
    @StringRes text: Int,
    modifier: Modifier = Modifier) {
    /*Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        //modifier = modifier.fillMaxSize()
    ) {*/
        Surface(
            shape = MaterialTheme.shapes.small,
            //modifier = Modifier.fillMaxSize() othervise all surface after that will be white
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.width(170.dp)){
                Image(
                    painter = painterResource(id = drawable),//R.drawable.p1plastic),
                    contentScale = ContentScale.Crop,
                    contentDescription = null,
                    modifier = Modifier
                            .size(56.dp)
                )
                Text(
                    stringResource(id = text),//R.string.windPower),
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
            }

        }
    //}
}


