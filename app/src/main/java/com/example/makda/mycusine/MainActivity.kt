package com.example.makda.mycusine

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var adapter: RecipeAdapter?= null
    private val items: ArrayList<ListItem> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView.onItemClickListener = this

        val list = findViewById<ListView>(R.id.listView)
        items.add(ListItem(R.drawable.dish_icon, "name", "desc"))

        adapter = RecipeAdapter(this, items)

        list.adapter = adapter

        floatingActionButton.setOnClickListener {
            addNewRecipe()
        }
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val intent = Intent(this, ViewItemActivity::class.java)
        intent.putExtra("name", items[position].name)
        intent.putExtra("desc", items[position].desc)
        startActivity(intent)
    }

    private fun addNewRecipe() {
        val intent = Intent(this, AddRecipeActivity::class.java)
        startActivityForResult(intent, 0)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        items.add(ListItem(R.drawable.dish_icon,
                data!!.getStringExtra("name"), data!!.getStringExtra("description")))
        adapter!!.notifyDataSetChanged()
    }
}
