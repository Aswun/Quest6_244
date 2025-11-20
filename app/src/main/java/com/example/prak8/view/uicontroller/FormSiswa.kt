package com.example.prak8.view.uicontroller

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.prak8.R

@Composable
fun FormSiswa() {

    //edit 2 : tambahkan 4 variabel dibawah ini
    var txtNama by rememberSaveable { mutableStateOf("") }
    var txtAlamat by remember { mutableStateOf("") }
    var txtGender by remember { mutableStateOf("") }
    val listData: MutableList<String> = mutableListOf(txtNama, txtAlamat, txtGender)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.app_name), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.purple_500)
                )
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier
                .padding(isiRuang)
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // ➤ TextField Nama
            OutlinedTextField(
                value = txtNama,
                onValueChange = { txtNama = it },
                singleLine = true,
                label = { Text("Nama Lengkap") },
                modifier = Modifier
                    .padding(top = 20.dp)
                    .width(250.dp),
                shape = MaterialTheme.shapes.medium
            )

            HorizontalDivider(
                modifier = Modifier
                    .padding(12.dp)
                    .width(250.dp),
                thickness = dimensionResource(id = R.dimen.thickness_divider),
                color = Color.Blue
            )

            // ➤ Radio Button JK
            Row(
                modifier = Modifier.padding(top = 10.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                pilihanJk.forEach { item ->
                    Row(
                        modifier = Modifier
                            .selectable(
                                selected = txtGender == item,
                                onClick = { txtGender = item }
                            )
                            .padding(end = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = txtGender == item,
                            onClick = { txtGender = item }
                        )
                        Text(item)
                    }
                }
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(5.dp)
                    .width(250.dp),
                thickness = dimensionResource(id = R.dimen.thickness_divider),
                color = Color.Blue
            )
        }
    }
}
