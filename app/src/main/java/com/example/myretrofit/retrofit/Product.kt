package com.example.myretrofit.retrofit

data class Product(
    val id: Int,
    val title: String,
    val description: String,
    val discountPercentage: Float,
    val rating: Float,
    val stock: Float,
    val brand: String,
    val category: String,
    val thumbnail: String,
    val image: List<String>
)
