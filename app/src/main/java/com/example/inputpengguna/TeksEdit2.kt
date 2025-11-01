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

