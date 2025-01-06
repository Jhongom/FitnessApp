package dev.jhonhab.fitnessapp.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.jhonhab.fitnessapp.R

@Preview
@Composable
fun Onboarding1(){
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
            .padding(30.dp),
    ) {
        Column(
            verticalArrangement = Arrangement.Top

        ) {
            Image(painterResource(id = R.drawable.onboard1),
                contentDescription = "onboarding1",
                modifier = Modifier.size(455.dp)
            )
            Column(
            ) {
                Text(text = "Track Your Goal",
                    fontFamily = FontFamily(Font(R.font.poppins_extrabold)),
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(0.dp, 10.dp))
                Text(text = "Don't worry if you have trouble determining your goals, We can help you determine your goals and track your goals",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Light,
                    color = Color.Gray)
            }
        }
        Image(painterResource(R.drawable.onboardbutton),
            contentDescription = "button",
            modifier = Modifier
                .size(50.dp)
                .fillMaxWidth()
                .height(20.dp))

    }

}