package com.example.makda.mycusine

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_add_recipie.*
import android.content.Intent

class AddRecipeActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_recipie)

        button.setOnClickListener {
            val nameEditText: EditText = findViewById(R.id.recipieNameText)

            val intent = Intent()
            intent.putExtra("result", nameEditText.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}