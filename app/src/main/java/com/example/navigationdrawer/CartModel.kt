package com.example.cart_items

data class CartModel(
    var productUrl:String?= null,
    var productName:String?=null,
    var productBrandName : String? = null,
    var productPrice : String? = null,
    var productQuantity:Int?=null
)