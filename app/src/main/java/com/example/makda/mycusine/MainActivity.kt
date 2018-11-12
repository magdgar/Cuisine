package com.example.makda.mycusine

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var adapter: ArrayAdapter<String>? = null
    private val items: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = findViewById<ListView>(R.id.listView)
        items.add("recipe a")

        adapter = ArrayAdapter(this, R.layout.list_item, items)

        list.adapter = adapter

        floatingActionButton.setOnClickListener {
            addNewRecipe(it, this.items)
        }
    }

    private fun addNewRecipe(view: View, extras: ArrayList<String>) {
        val intent = Intent(this, AddRecipeActivity::class.java)
        intent.putExtra("recipeList", extras)
        startActivityForResult(intent, 0)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        items.add(data!!.getStringExtra("result"))
        adapter!!.notifyDataSetChanged()
    }
}
