package com.sintatsky.ramproject.domain.entities

import com.google.gson.annotations.SerializedName

data class LocationInfo(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("dimension")
    val dimension: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("residents")
    val characters: List<String>?
)
