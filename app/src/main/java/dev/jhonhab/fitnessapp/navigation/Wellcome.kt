package dev.jhonhab.fitnessapp.navigation

import androidx.activity.ComponentActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dev.jhonhab.fitnessapp.R
import dev.jhonhab.fitnessapp.utils.Routes


@Composable
fun WellcomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(30.dp),
        verticalArrangement = Arrangement.SpaceBetween, // Espacio entre los elementos
        horizontalAlignment = Alignment.CenterHorizontally // Centra los textos horizontalmente
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally // Alinea los textos en el centro

        ) {
            Text(
                text = "Fitness HAB",
                fontFamily = FontFamily(Font(R.font.poppins_extrabold)),
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Everybody Can Train",
                modifier = Modifier.padding(6.dp),
                fontSize = 18.sp,
                fontWeight = FontWeight.Light
            )
        }

        // Botón en la parte inferior
        Button(
            onClick = {
                navController.navigate(Routes.onboarding1)
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ) {
            Text(
                text = "Get Started",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }

}