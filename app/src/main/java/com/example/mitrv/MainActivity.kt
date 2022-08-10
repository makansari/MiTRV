package com.example.mitrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var mylist : ArrayList<TeachersData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myRecyclerView = findViewById<RecyclerView>(R.id.myRv)
        myRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        mylist = ArrayList<TeachersData>()

        myRecyclerView.adapter = MyAdapter(mylist)

        myDataSource()
    }

    private fun myDataSource() {
        var teacher1= TeachersData("ManiRam", "Android")
        mylist.add(teacher1)
        var teacher2= TeachersData("Rakshit", "IOS")
        mylist.add(teacher2)
        var teacher3= TeachersData("Ansari", "Python")
        mylist.add(teacher3)
        var teacher4= TeachersData("Karthik", "Flutter")
        mylist.add(teacher4)
        var teacher5= TeachersData("Tariq", "React")
        mylist.add(teacher5)

    }
}