package com.example.prak8.view.uicontroller

fun FormSiswa (
    //edit 2 : tambahkan 4 variabel dibawah ini
    var txtNama by remember { mutableStateOf("") }
    var txtAlamat by remember { mutableStateOf("") }
    var txtGender by remember { mutableStateOf("") }
    val listData: MutableList<String> = mutableListOf(txtNama, txtAlamat, txtGender)
)