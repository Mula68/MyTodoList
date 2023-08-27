package com.mula68.mytodolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.mula68.mytodolist.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myList = binding.myList

        val countryList = arrayOf("Uganda", "Kenya", "Tanzania", "Rwanda", "Burundi", "DRC",
            "South Sudan", "Ethiopia", "Somalia", "Eritrea")

        val arrayAdapter = ArrayAdapter(this, R.layout.list_item, R.id.country_item, countryList)

        myList.adapter = arrayAdapter
    }
}