package com.example.makda.mycusine

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = findViewById<ListView>(R.id.listView)
        val items = ArrayList<String>()
        items.add("recipe a")

        val adapter = ArrayAdapter(this, R.layout.list_item, items)

        list.adapter = adapter

        floatingActionButton.setOnClickListener {
            //addNewRecipe(it, items)
            items.add("recipe x")
            adapter.notifyDataSetChanged()
        }
    }

    fun addNewRecipe(view: View, extras: ArrayList<String>) {
        val intent = Intent(this, AddRecipeActivity::class.java)
        //intent.putExtra("recipeList", extras)
        startActivity(intent)
    }
}
