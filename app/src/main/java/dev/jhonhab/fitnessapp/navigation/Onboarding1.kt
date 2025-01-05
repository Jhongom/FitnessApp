package dev.jhonhab.fitnessapp.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.jhonhab.fitnessapp.R

@Preview
@Composable
fun Onboarding1(){
    Column(
        modifier = Modifier.background(color = Color.White),
    ) {
        Column(
            verticalArrangement = Arrangement.Top

        ) {
            Image(painterResource(id = R.drawable.onboarding1),
                contentDescription = "onboarding1",
                modifier = Modifier.fillMaxSize().height(250.dp)
            )
            Column {
                Text(text = "Track Your Goal")
                Text(text = "Don't worry if you have trouble determining your goals, We can help you determine your goals and track your goals")
            }
        }

    }

}