package io.github.leofernandesss.checklistsupermarket.ui.splash

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import io.github.leofernandesss.checklistsupermarket.R

class SplashViewModel : ViewModel() {

    fun goToHomeFragment(navController: NavController) {
        Handler(Looper.getMainLooper()).postDelayed({
            navController.navigate(R.id.action_splashFragment_to_homeFragment)
        }, 4000)
    }

}