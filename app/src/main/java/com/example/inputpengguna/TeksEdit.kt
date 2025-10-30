package com.example.inputpengguna

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle


annotation class composable

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
        horizontalAlignment = LineHeightStyle.Alignment.CenterHorizontally
    )
    {
        OutlinedTextField(
            value = textNama
            singelLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width (width = 250.dp),
            label = { Text(text = "Nama Lengkap")},
            onValueChange = {textNama = it}
        )

        Row {
            gender.forEach { item ->
                Row(modifier = Modifier.selectable(
                    selected = textJK == item,
                    onClick = {
                        textJK = item
                    }),vertical Alignment .CenterVertically)
                {
                    RadioButton(selected = textJK == item,
                        onClick = {
                            textJK = item
                        }
                    )
            }
                OutlinedTextField(
                    value = textAlamat
                            singelLine = true,
                    modifier = Modifier.width (width = 250.dp),
                    label ={ Text(text = "Alamat Lengkap")},
                    onValueChange = {textAlamat = it}
                )

                HorizontalDivider(
                    modifier = Modifier.padding(bottom = dimensionResource(30dp),
                        top =dimensionResource(
                            id=30dp
                    )),
                    t
                )

        }

    }

}