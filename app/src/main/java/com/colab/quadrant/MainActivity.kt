package com.colab.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.colab.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantApp()
                }
            }
        }
    }
}

@Composable
fun QuadrantApp() {
    Column {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            QuadrantItem(
                title = stringResource(R.string.q1_title),
                description = stringResource(R.string.q1_description),
                color = colorResource(R.color.q1_color),
                modifier = Modifier.weight(1f)
            )
            QuadrantItem(
                title = stringResource(R.string.q2_title),
                description = stringResource(R.string.q2_description),
                color = colorResource(R.color.q2_color),
                modifier = Modifier.weight(1f)
            )
        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            QuadrantItem(
                title = stringResource(R.string.q3_title),
                description = stringResource(R.string.q3_description),
                color = colorResource(R.color.q3_color),
                modifier = Modifier.weight(1f)
            )
            QuadrantItem(
                title = stringResource(R.string.q4_title),
                description = stringResource(R.string.q4_description),
                color = colorResource(R.color.q4_color),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun QuadrantItem(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    color: Color
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    QuadrantTheme {
        QuadrantApp()
    }
}