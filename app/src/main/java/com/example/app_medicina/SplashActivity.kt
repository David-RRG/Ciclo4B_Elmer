package com.example.app_medicina //yes

import android.animation.Animator
import android.content.Intent

import android.os.Bundle //yes
import android.util.Log
import com.google.android.material.snackbar.Snackbar //yes
import androidx.appcompat.app.AppCompatActivity //yes
import androidx.navigation.findNavController //yes
import androidx.navigation.ui.AppBarConfiguration //yes
import androidx.navigation.ui.navigateUp //yes
import androidx.navigation.ui.setupActionBarWithNavController //yes
import com.example.app_medicina.databinding.ActivitySplashBinding //yes

class SplashActivity : AppCompatActivity() {

    //private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater) //inicializando variable binding
        setContentView(binding.root) //yes
            // en setContentView() el profe borra el codigo default y coloca "binding.root"
    }
    override fun onStart(){
        super.onStart()
        binding.splashAnimation.playAnimation() //ejecutar animacion de lottie
        binding.splashAnimation.addAnimatorListener(object:Animator.AnimatorListener{
            override fun onAnimationStart(animation: Animator?) {
            }

            override fun onAnimationEnd(animation: Animator?) {
                //Log.d("Hola","Animacion finalizada")
                val intent = Intent(applicationContext,LoginActivity::class.java)
                    //la forma de navegar a otra pnatalla es crear un intencion explicita,
                        //indicando la actividad/pantalla a la q queremos navegar
                startActivity(intent)
                    //se activa la actividad guardada en la variable correspondiente
                finish()
                    //se destruye la app para q se cierre al clickear en el triangulo "atras"
            }
            override fun onAnimationCancel(animation: Animator?) {
            }

            override fun onAnimationRepeat(animation: Animator?) {
            }

        }) // detectar cuando la animacion de lottie haya terminado
    }


}