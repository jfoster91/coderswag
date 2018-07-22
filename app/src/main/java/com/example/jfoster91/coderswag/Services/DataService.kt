package com.example.jfoster91.coderswag.Services

import com.example.jfoster91.coderswag.Model.Category
import com.example.jfoster91.coderswag.Model.Product
import java.util.*

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Hat Black", "$20", "hat02"),
            Product("Devslopes Hat White", "$22", "hat03"),
            Product("Devslopes Snapback", "$18", "hat04")

    )

    val hoodies = listOf(
            Product("Devlopes Hoodies Grey", "$28", "hoodie01"),
            Product("Devlopes Hoodies Red", "$32", "hoodie02"),
            Product("Devlopes Hoodies Black", "$28", "hoodie03"),
            Product("Devlopes Hoodies Silver", "$45", "hoodie04")

    )

    val shirts = listOf(
            Product("Devlopes Shirt Black", "$18", "hoodie01"),
            Product("Devlopes Badge Light Grey", "$22", "hoodie02"),
            Product("Devlopes Logo Red", "$22", "hoodie03"),
            Product("Devlopes Hustle", "$20", "hoodie04"),
            Product("Kickflip Studio", "$18", "hoodie05"))

}
