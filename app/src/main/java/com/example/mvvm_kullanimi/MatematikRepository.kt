package com.example.mvvm_kullanimi

class MatematikRepository {

    // tek görevi data source ı yonetmek
    // fonkları calıstırmak gibi c++ de header ve cpp dosyası mantıgı

    var mds = MatematikDataSource()
    suspend fun toplamaYap(alinanSayi1: String,alinanSayi2: String) : String{
        return mds.toplamaYap(alinanSayi1,alinanSayi1)
    }

    // fonk bu sekilde de yapılıur
    suspend fun carpmaYap(alinanSayi1: String,alinanSayi2: String): String
    = mds.carpmaYap(alinanSayi1,alinanSayi2)

}