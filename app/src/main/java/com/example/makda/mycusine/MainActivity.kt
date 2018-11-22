package com.example.makda.mycusine

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var adapter: RecipeAdapter?= null
    private val items: ArrayList<ListItem> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = findViewById<ListView>(R.id.listView)
        items.add(ListItem(R.drawable.abc_btn_check_to_on_mtrl_015, "name", "desc"))

        adapter = RecipeAdapter(this, items)

        list.adapter = adapter

        floatingActionButton.setOnClickListener {
            addNewRecipe()
        }
    }

    private fun addNewRecipe() {
        val intent = Intent(this, AddRecipeActivity::class.java)
        startActivityForResult(intent, 0)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        items.add(ListItem(R.drawable.abc_btn_check_to_on_mtrl_015, data!!.getStringExtra("name"), "m"))
        adapter!!.notifyDataSetChanged()
    }
}
