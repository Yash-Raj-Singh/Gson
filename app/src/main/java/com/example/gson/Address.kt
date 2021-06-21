package com.example.gson

import com.google.gson.annotations.SerializedName

class Address {

    @SerializedName("country")
    private var mCountry: String? = null

    @SerializedName("city")
    private var mCity: String? = null

    constructor(country: String, city: String)
    {
        mCountry = country
        mCity = city
    }

}