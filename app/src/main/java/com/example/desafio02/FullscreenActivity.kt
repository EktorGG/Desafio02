package com.example.desafio02

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.example.desafio02.databinding.ActivityFullscreenBinding

class FullscreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFullscreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflamos el layout usando View Binding
        binding = ActivityFullscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Detectamos el modo actual (claro u oscuro)
        val currentNightMode = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK

        // Cambiar colores dinámicamente el fondo según el modo claro u oscuro
        val fullscreenContent: ConstraintLayout = binding.fullscreenContent
        if (currentNightMode == Configuration.UI_MODE_NIGHT_YES) {
            fullscreenContent.setBackgroundColor(ContextCompat.getColor(this, R.color.colorBackgroundDark))
            binding.vectorImageView.setColorFilter(ContextCompat.getColor(this, R.color.vector_color_dark), android.graphics.PorterDuff.Mode.SRC_IN)
        } else {
            fullscreenContent.setBackgroundColor(ContextCompat.getColor(this, R.color.colorBackground))
            binding.vectorImageView.setColorFilter(ContextCompat.getColor(this, R.color.vector_color), android.graphics.PorterDuff.Mode.SRC_IN)
        }
    }
}
