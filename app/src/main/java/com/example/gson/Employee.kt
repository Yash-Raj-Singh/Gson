package com.example.gson

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Employee {

    @Expose(serialize = false, deserialize = true)
    @SerializedName("firstName")
    private var mfirstName: String? = null

    @Expose(deserialize = false)
    @SerializedName("age")
    private var mage: Int = 0

    @Expose(serialize = true, deserialize = true)
    @SerializedName("mail")
    private var mmail:String? = null

    @SerializedName("password")
    @Transient private var mPassword: String? = null

    constructor(  firstName: String,  age: Int, mail: String, password: String)
    {
        mfirstName = firstName
        mage = age
        mmail = mail
        mPassword = password
    }

}