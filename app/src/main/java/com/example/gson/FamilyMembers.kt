package com.example.gson

import com.google.gson.annotations.SerializedName

class FamilyMembers {

    @SerializedName("role")
    private var mRole: String? = null

    @SerializedName("age")
    private var mAge: Int = 0

    constructor(role: String, age: Int)
    {
        mRole = role
        mAge = age
    }

}