package com.example.mvvm_kullanimi

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MatematikDataSource {

   suspend fun toplamaYap(alinanSayi1: String,alinanSayi2: String) : String=
       withContext(Dispatchers.IO){
           // return ediceksek bu şekılde yazıyoruz
           // Coroutine boyle yapılrı
           val sayi1 =alinanSayi1.toInt()
           val sayi2 =alinanSayi2.toInt()
           val toplam = sayi1+sayi2
           return@withContext toplam.toString()

       }


   suspend fun carpmaYap(alinanSayi1: String,alinanSayi2: String):String=
       withContext(Dispatchers.IO){
           // return ediceksek bu şekılde yazıyoruz
           val sayi1 =alinanSayi1.toInt()
           val sayi2 =alinanSayi2.toInt()
           val carpma = sayi1*sayi2
           return@withContext carpma.toString()

       }


}