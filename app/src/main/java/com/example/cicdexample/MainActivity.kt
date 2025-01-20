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
    val list2 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list3 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list4 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list5 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list6 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list7 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list8 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list9 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list10 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list11 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list12 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list13 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list14 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list15 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list16 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list17 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list18 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list19 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list20 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list21 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list22 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list23 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list24 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list25 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list26 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list27 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list28 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list29 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list30 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list31 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list32 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list33 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list34 = listOf("seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang", "seminzzang",)
    val list999 =
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
        modifier = modifier
    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() { CICDExampleTheme { Greeting("Android") } }
