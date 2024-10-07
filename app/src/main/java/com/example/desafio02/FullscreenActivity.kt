package com.example.desafio02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.desafio02.databinding.ActivityFullscreenBinding

class FullscreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflamos el layout usando View Binding
        binding = ActivityFullscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inicializamos el ConstraintLayout desde View Binding
        fullscreenContent = binding.fullscreenContent

        }

    // Cambiamos el tipo de la variable fullscreenContent a ConstraintLayout
    private lateinit var binding: ActivityFullscreenBinding
    private lateinit var fullscreenContent: ConstraintLayout
}
