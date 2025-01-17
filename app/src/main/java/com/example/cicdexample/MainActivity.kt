package com.example.cicdexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cicdexample.ui.theme.CICDExampleTheme

class MainActivity : ComponentActivity() {
    val list = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list2 =
        listOf(
            "seminzzang",
            "seminzzang",
            "seminzzang",
            "seminzzang",
            "seminzzang",
            "seminzzang",
            "seminzzang",
            "seminzzang",
            "seminzzang",
            "seminzzang",
            "seminzzang",
            "seminzzang",
            "seminzzang",
            "seminzzang",
            "seminzzang",
            "seminzzang",
        )
    val test = "seminzzang"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CICDExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }

}

@Composable
fun Greeting(
    name: String,
    modifier: Modifier = Modifier,
) {
    Text(
        text = "Hello $name!!!!!!!!!!!!",
        modifier = modifier,
    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CICDExampleTheme {
        Greeting("Android")
    }

}
