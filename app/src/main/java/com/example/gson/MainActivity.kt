package com.example.gson

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.GsonBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson: Gson = GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
//
//        val employee: Employee = Employee("John", 30, "abcc@lmail.com", "point321")
//
//        val json: String = gson.toJson(employee)

        val json: String = "{\"age\":30,\"mail\":\"abcc@lmail.com\"}"

        val employee: Employee = gson.fromJson(json, Employee::class.java)
    }
}