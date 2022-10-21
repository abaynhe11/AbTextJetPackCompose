package com.google.firebase.quickstart.auth.abtextjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.google.firebase.quickstart.auth.abtextjetpackcompose.ui.theme.AbTextJetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AbTextJetPackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AbTextType()
                }
            }
        }
    }
}
@Composable
fun TextWithSize(label : String, size : TextUnit) {
    Text(label, fontSize = size)
}

@Composable
fun ColorText() {
    Text("Color text", color = Color.Blue)
}

@Composable
fun BoldText() {
    Text("Bold text", fontWeight = FontWeight.Bold)
}

@Composable
fun ItalicText() {
    Text("Italic Text", fontStyle = FontStyle.Italic)
}

@Composable
fun MaxLines() {
    Text("hello ".repeat(50), maxLines = 2)
}

@Composable
fun OverflowedText() {
    Text("Hello Compose ".repeat(50), maxLines = 2, overflow = TextOverflow.Ellipsis)
}


@Composable
fun SelectableText() {
    SelectionContainer {
        Text("This text is selectable")
    }
}
@Composable
fun AbTextType() {
    Column{
        TextWithSize("Big text",40.sp)
        ColorText()
        BoldText()
        ItalicText()
        MaxLines()
        OverflowedText()
        SelectableText()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    AbTextJetPackComposeTheme {
        AbTextType()
    }
}