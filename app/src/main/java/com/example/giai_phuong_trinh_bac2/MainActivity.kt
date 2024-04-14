package com.example.giai_phuong_trinh_bac2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.giai_phuong_trinh_bac2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSolve.setOnClickListener {
            val a = binding.edtA.text.toString().toDoubleOrNull() ?: 0.0
            val b = binding.edtB.text.toString().toDoubleOrNull() ?: 0.0
            val c = binding.edtC.text.toString().toDoubleOrNull() ?: 0.0

            val delta = b * b - 4 * a * c

            if (delta < 0) {
                binding.tvKetqua.text = "Phương trình vô nghiệm"
            } else if (delta == 0.0) {
                val x = -b / (2 * a)
                binding.tvKetqua.text = "x = $x"
            } else {
                val x1 = (-b + Math.sqrt(delta)) / (2 * a)
                val x2 = (-b - Math.sqrt(delta)) / (2 * a)
                binding.tvKetqua.text = "x1 = $x1 và x2 = $x2"
            }
        }
    }
}
