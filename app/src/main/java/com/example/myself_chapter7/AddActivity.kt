package com.example.myself_chapter7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import com.example.myself_chapter7.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityAddBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textInputEditText.addTextChangedListener {
            it?.let{text ->
                binding.textTextInputLayout.error = when(text.length){
                    0 -> "값을 입력하시오."
                    1 -> "2자 이상 입력하시오."
                    else -> null
                }
            }
        }
    }
}
