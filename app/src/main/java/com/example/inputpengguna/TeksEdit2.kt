package com.example.inputpengguna

import androidx.compose.foundation.background
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.material3.Divider

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.example.inputpengguna.ui.theme.Purple40



@Composable
fun FormDataDiri(modifier: Modifier = Modifier) {
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }

    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenis by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }

    val gender: List<String> = listOf("Laki-laki", "Perempuan")
    val statusList: List<String> = listOf("Janda", "Lajang", "Duda")

    Column(
        modifier = modifier
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Formulir Pendaftaran",
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF6750A4))
                .padding(top = 16.dp, bottom = 24.dp),
            textAlign = TextAlign.Center,
            color = Color.White
        )

        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            label = { Text(text = "Isian Nama Lengkap") },
            onValueChange = {
                textNama = it
            }
        )
        Spacer(modifier = Modifier.height(16.dp))


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Text(text = "JENIS KELAMIN", style = MaterialTheme.typography.bodyMedium)
            gender.forEach { item ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .selectable(
                            selected = textJK == item,
                            onClick = { textJK = item }
                        ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = textJK == item,
                        onClick = { textJK = item }
                    )
                    Text(item)
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Text(text = "STATUS PERKAWINAN", style = MaterialTheme.typography.bodyMedium)
            statusList.forEach { item ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .selectable(
                            selected = textStatus == item,
                            onClick = { textStatus = item }
                        ),
