package com.ihsanarslan.textinputlayoutcheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import androidx.core.content.ContextCompat
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        kontrol()
    }
    fun kontrol() {
        val til1 = findViewById<TextInputLayout>(R.id.pass1Layout)
        val et1 = findViewById<EditText>(R.id.pass1)

        et1.addTextChangedListener(
            object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                    if (s != null && s.length < 8) {
                        til1.boxStrokeColor = ContextCompat.getColor(applicationContext, R.color.red)
                    } else {
                        til1.boxStrokeColor = ContextCompat.getColor(applicationContext, R.color.black)
                    }
                }

                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            })
    }

}