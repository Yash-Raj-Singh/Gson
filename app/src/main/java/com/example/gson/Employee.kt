package com.example.gson

import com.google.gson.annotations.SerializedName

class Employee {

    @SerializedName("firstName")
    private var mfirstName: String? = null

    @SerializedName("age")
    private var mage: Int = 0

    @SerializedName("mail")
    private var mmail:String? = null

    @SerializedName("address")
    private var mAddress: Address

    constructor(  firstName: String,  age: Int, mail: String, address: Address)
    {
        mfirstName = firstName
        mage = age
        mmail = mail
        mAddress = address
    }

}