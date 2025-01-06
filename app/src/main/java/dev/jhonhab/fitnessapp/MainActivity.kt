package dev.jhonhab.fitnessapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.jhonhab.fitnessapp.navigation.Onboarding1
import dev.jhonhab.fitnessapp.navigation.Onboarding2
import dev.jhonhab.fitnessapp.navigation.WellcomeScreen
import dev.jhonhab.fitnessapp.ui.theme.FitnessappTheme
import dev.jhonhab.fitnessapp.utils.Routes


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FitnessappTheme {
                val navController = rememberNavController()
                NavHost(navController = navController , startDestination = Routes.wellcomeSC, builder = {
                    composable(Routes.wellcomeSC) {
                        WellcomeScreen(navController)
                    }
                    composable(Routes.onboarding1) {
                        Onboarding1(navController)
                    }
                    composable(Routes.onboarding2) {
                        Onboarding2()
                    }
                })
            }
        }
    }
}

