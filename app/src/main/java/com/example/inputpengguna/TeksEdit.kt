package com.example.inputpengguna

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard // Typo: ElevateCard -> ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable // Typo: annotation class & @composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color // Import: Dibutuhkan untuk Color.DarkGray/Black/White
import androidx.compose.ui.unit.dp
// ------------------------------

// Typo: 'annotation class composable' & '@composable' diubah menjadi '@Composable'
@Composable
fun FormatDataDiri(modifier: Modifier = Modifier) { // Tambahkan default Modifier
    //variable untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf(value = "") }
    var textAlamat by remember { mutableStateOf(value = "") }
    var textJK by remember { mutableStateOf(value = "") }

    //variabel untuk menyimpan data yang diperoleh dari komponer
    var nama by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var jenis by remember { mutableStateOf(value = "") }

    val gender: List<String> = listOf("Laki-laki", "Perempuan")

    Column(
        modifier = modifier // Menggunakan modifier dari parameter
            .fillMaxSize() // Menambahkan fillMaxSize agar Column terpusat
            .padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        // Kesalahan: 'LineHeightStyle.Alignment.CenterHorizontally' diubah menjadi 'Alignment.CenterHorizontally'
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        OutlinedTextField(
            value = textNama,
            singleLine = true, // Typo: singelLine -> singleLine
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(width = 250.dp),
            label = { Text(text = "Nama Lengkap") },
            onValueChange = { textNama = it }
        )

        // Row ini HANYA untuk pilihan gender
        Row(modifier = Modifier.padding(16.dp)) {
            gender.forEach { item ->
                Row(
                    modifier = Modifier.selectable(
                        selected = textJK == item,
                        onClick = {
                            textJK = item
                        }
                    ),
                    // Kesalahan Sintaks: 'vertical Alignment .CenterVertically' diubah
                    verticalAlignment = Alignment.CenterVertically
                )
                {
                    RadioButton(
                        selected = textJK == item,
                        onClick = {
                            textJK = item
                        }
                    )
                    // Ditambahkan: Text untuk label RadioButton
                    Text(item, modifier = Modifier.padding(start = 8.dp))
                }
            }
        } // <-- KESALAHAN STRUKTURAL: Loop 'forEach' dan Row-nya berakhir di sini

        // --- SEMUA KOMPONEN DI BAWAH INI DIPINDAHKAN KE LUAR DARI LOOP 'forEach' ---

        OutlinedTextField(
            value = textAlamat,
            singleLine = true, // Typo: singelLine -> singleLine
            modifier = Modifier.width(width = 250.dp),
            label = { Text(text = "Alamat Lengkap") },
            onValueChange = { textAlamat = it }
        )

        HorizontalDivider(
            modifier = Modifier.padding(
                bottom = 16.dp, // Mengganti 'dimensionResource' dengan 'dp' agar bisa compile
                top = 16.dp
            ),
            thickness = 1.dp, // Mengganti 'dimensionResource' dengan 'dp'
            color = Color.DarkGray // Typo: color.DarkGray -> Color.DarkGray
        )

        Button(
            modifier = Modifier.fillMaxWidth(fraction = 0.8f), // Typo: fillMaxwidth -> fillMaxWidth (diberi fraksi 0.8f agar tidak terlalu lebar)
            // Typo: isNotempty -> isNotEmpty
            enabled = textAlamat.isNotEmpty(),
            onClick = {
                nama = textNama
                jenis = textJK
                alamat = textAlamat
            }
        ) {
            // Mengganti 'stringResource' dengan teks langsung agar bisa compile
            Text(text = "Submit")
        }

        HorizontalDivider(
            // Kesalahan: Modifier harus di dalam parameter, bukan di content lambda {}
            modifier = Modifier.padding(
                bottom = 16.dp, // Mengganti 'dimensionResource' dengan 'dp'
                top = 16.dp
            ),
            thickness = 1.dp, // Mengganti 'dimensionResource' dengan 'dp'
            color = Color.DarkGray // Typo: color.DarkGray -> Color.DarkGray
        )

        ElevatedCard( // Typo: ElevateCard -> ElevatedCard
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp // Mengganti 'dimensionResource' dengan 'dp'
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color.Black // Typo: ContainerColor -> containerColor
            ),
            // Kesalahan: Modifier harus di dalam parameter 'ElevatedCard(...)'
            modifier = Modifier
                .height(100.dp)
                .width(300.dp)
        )
        // Kesalahan: Content lambda '{...}' untuk Card belum ada
        {
            // Column ini seharusnya di dalam Card
            Column(modifier = Modifier.padding(horizontal = 5.dp, vertical = 15.dp)) {
                Text(text = "Nama : " + nama, color = Color.White) // Typo: 'color=Color.White'
                Text(text = "Jenis Kelamin : " + jenis, color = Color.White)
                Text(text = "Alamat : " + alamat, color = Color.White)
            }
        }
    }
}