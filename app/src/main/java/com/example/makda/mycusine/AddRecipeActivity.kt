package com.example.makda.mycusine

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_add_recipie.*
import android.content.Intent




class AddRecipeActivity: AppCompatActivity() {

    private var nameEditText: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_recipie)

        nameEditText = findViewById(R.id.recipieNameText)

        button.setOnClickListener {
            val intent = Intent()
            intent.putExtra("r", "a")
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}