package com.example.task2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task2.ui.theme.Task2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Task2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "All tasks completed",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
//        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.task),
            contentDescription = "image",
            modifier = Modifier.fillMaxWidth()
                .padding(top = 250.dp)


        )
        Text(
            text = name,
            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
            modifier = modifier.align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = "Nice work!",
//            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
            modifier = modifier.align(alignment = Alignment.CenterHorizontally)

        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Task2Theme {
        Greeting("All tasks completed")
    }
}