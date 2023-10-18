package com.example.todolist

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import com.example.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var currentItemSelected = -1;

        val arrayItens = ArrayList<Item>();

        arrayItens.add(Item("Vassoura", "Nova"))
        arrayItens.add(Item("Banana", "Madura"))
        arrayItens.add(Item("Biscoito", "Biscoto da marca mabel"))

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayItens);

        binding.todosList.adapter = adapter;
        adapter.notifyDataSetChanged();


        binding.todosList.setOnItemClickListener { _, _, position, _ ->
            currentItemSelected = position;
        }

        binding.addItem.setOnClickListener {
            val newItem = Item("Item ", "Descrição do Item");
            arrayItens.add(newItem);
            adapter.notifyDataSetChanged();
        }

        binding.removeItem.setOnClickListener {
            if(currentItemSelected > 0) {
                arrayItens.removeAt(currentItemSelected);
                currentItemSelected = -1;
                adapter.notifyDataSetChanged();
            }
        }

    }
}