package com.example.gson

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson: Gson = Gson()

        /*var json: String = gson.toJson(Employee("HOY", 20, "abc@gmail.com"))
        */

        val json: String = "{\"age\":20,\"firstName\":\"HOY\",\"mail\":\"abc@gmail.com\"}"

        val employee: Employee = gson.fromJson(json, Employee::class.java)

    }
}