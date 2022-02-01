package com.example.to_do_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recycler: RecyclerView
    private lateinit var adapter: Todo_Adapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var check: CheckBox = findViewById(R.id.check)
        val add: Button = findViewById(R.id.add)
        val new_text: TextView = findViewById(R.id.new_text)
        val todo_list_of_items = mutableListOf<Todo_list>()
        todo_list_of_items.add(Todo_list("Add a new Task here"))
        adapter = Todo_Adapter(this, todo_list_of_items)

        recycler = findViewById(R.id.recycle)
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this)
        add.setOnClickListener {
            val text = new_text.text
            val items = todo_list_of_items

            todo_list_of_items.add(Todo_list(text as String))
            adapter.notifyItemInserted(-1)
        }
//        check.setOnClickListener {
//            var l = todo_list_of_items.size
//            Toast.makeText(this, "Well done!!\n You have l tasks left ", Toast.LENGTH_SHORT).show()
//        }
    }
}