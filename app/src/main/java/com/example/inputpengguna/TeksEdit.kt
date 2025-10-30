package com.example.inputpengguna


@composable
fun FormatDataDiri(modifier: Modifier
){
    //variable untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf(value ="") }
    var textAlamat by remember { mutableStateOf(value ="") }
    var textJK by remember { mutableStateOf(value ="") }

    //variabel untuk menyimpan data yang diperoleh dari komponer
    var nama by remember { mutableStateOf(value ="") }
    var alamat by remember { mutableStateOf(value ="") }
    var jenis by remember { mutableStateOf(value ="") }

    val gender:List<String> = listOf("Laki-laki","Perempuan")

    Column(modifier = Modifier.padding(top = 50.dp)
            verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        OutlinedTextField(
            value = textNama
    }


}