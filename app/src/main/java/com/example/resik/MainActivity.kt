package com.example.resik

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   val rv: RecyclerView = findViewById(R.id.my)
        rv.adapter =Adapter(getList())

    }

    fun getList():ArrayList<MyClass>{
        val list = ArrayList<MyClass>()

        (0 .. 50).forEach{
            list.add(MyClass("", "Name $it", "Surname $it"))
        }
    return list
    }




}

