package com.example.inputpengguna


@composable
fun FormatDataDiri(modifier: Modifier
){
    //variable untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf(value ="") }
    var textAlamat by remember { mutableStateOf(value ="") }
    var textJK by remember { mutableStateOf(value ="") }

