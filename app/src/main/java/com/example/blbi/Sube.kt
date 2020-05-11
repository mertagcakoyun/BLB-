package com.example.blbi

class Sube {

    val adi: String
    val adres: String
    val ulasim: String
    val dersler: List<String>
    val sosyal: String

    constructor(
        adi: String,
        adres: String,
        ulasim: String,
        dersler: List<String>,
        sosyal: String
    ) {
        this.adi = adi
        this.adres = adres
        this.ulasim = ulasim
        this.dersler = dersler
        this.sosyal = sosyal
    }

}