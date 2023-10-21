package com.example.todolist

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todolist.databinding.ActivityMainBinding
import com.example.todolist.models.Email

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var email = Email("a", "b", "c", "d", stared = false, true, selected = true);
        initList();



    }
    fun initList() {

        val listTodos = listOf<Item>(
            Item("ITEM NÚMERO 1", "DESCRIÇÃO - 1"),
            Item("ITEM NÚMERO 2", "DESCRIÇÃO - 2"),
            Item("ITEM NÚMERO 3", "DESCRIÇÃO - 3")
        )


        binding.recyclerViewMain.layoutManager = LinearLayoutManager(this);
        binding.recyclerViewMain.setHasFixedSize(true);
        binding.recyclerViewMain.adapter = AdapterEmailItem(listTodos);
    }
}