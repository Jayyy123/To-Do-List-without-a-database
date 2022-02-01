package com.example.to_do_list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Todo_Adapter(val context:Context, val todo_list: List<Todo_list>): RecyclerView.Adapter<Todo_Adapter.Todo_View_Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Todo_View_Holder {

        val j: View =  LayoutInflater.from(context).inflate(R.layout.note_design,parent,false)
        return Todo_View_Holder(j)
    }

    override fun onBindViewHolder(holder: Todo_View_Holder, position: Int) {
        val currentPostion = todo_list[position]
        holder.note_text?.text  = currentPostion.title
//        holder.check = currentPostion.checked
//        holder.delete = currentPostion.delete_box
    }

    override fun getItemCount(): Int {
        return todo_list.size
    }
    class Todo_View_Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        var note_text: TextView? = null
        var check: CheckBox? = null
        var delete: ImageView? = null

        init {
            note_text = itemView.findViewById(R.id.titlee)

            check = itemView.findViewById(R.id.check)

            delete = itemView.findViewById(R.id.delete_box)
        }
    }

}