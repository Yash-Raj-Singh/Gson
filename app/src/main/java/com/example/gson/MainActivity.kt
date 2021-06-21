package com.example.gson

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson: Gson = Gson()

        /*
        val address: Address = Address("India", "New Delhi")

        val family: ArrayList<FamilyMembers> = ArrayList()

        family.add(FamilyMembers("Friend", 20))
        family.add(FamilyMembers("Teacher", 0))
        family.add(FamilyMembers("Pet", 2))

        var json: String = gson.toJson(Employee("HOY", 21, "abc@gmail.com", address, family))
        */


        val json: String = "{\"address\":{\"city\":\"New Delhi\",\"country\":\"India\"},\"family\":[{\"age\":20,\"role\":\"Friend\"},{\"age\":0,\"role\":\"Teacher\"},{\"age\":2,\"role\":\"Pet\"}],\"age\":21,\"firstName\":\"HOY\",\"mail\":\"abc@gmail.com\"}"

        val employee: Employee = gson.fromJson(json, Employee::class.java)

    }
}