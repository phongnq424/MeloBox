package com.example.melobox.model

data class User(
    val id: Long,
    val userName: String,
    val avatar: String? = null
)