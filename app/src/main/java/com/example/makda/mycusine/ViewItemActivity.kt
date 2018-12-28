package com.example.makda.mycusine

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView




class ViewItemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_item_layout)

        val nameTextView = this.findViewById(R.id.recipeName) as TextView
        nameTextView.text = intent.extras["name"].toString()

        val descTextView = this.findViewById(R.id.recipeDescription) as TextView
        descTextView.text = intent.extras["desc"].toString()
    }
}