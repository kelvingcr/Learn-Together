package com.kelvincosta.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kelvincosta.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    JetpackTutorialImage()
                }
            }
        }
    }
}

@Composable
fun JetpackTutorialImage(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column() {
        Image(painter = image, contentDescription = null)
        Text(
            text = stringResource(R.string.article_title),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp))

        Text(
            text = stringResource(R.string.article_subtitle_one),
            textAlign = TextAlign.Justify,
            modifier = Modifier. padding(
                start = 16.dp,
                end = 16.dp
            ))

        Text(
            text = stringResource(R.string.article_subtitle_two),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp))
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        JetpackTutorialImage()
    }
}