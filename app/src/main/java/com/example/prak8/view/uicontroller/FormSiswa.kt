package com.example.prak8.view.uicontroller

import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.prak8.R

@Composable
fun FormSiswa (
    //edit 2 : tambahkan 4 variabel dibawah ini
    var txtNama by rememberSaveable { mutableStateOf("") }
    var txtAlamat by remember { mutableStateOf("") }
    var txtGender by remember { mutableStateOf("") }
    val listData: MutableList<String> = mutableListOf(txtNama, txtAlamat, txtGender)

    Scaffold(modifier = Modifier,
        {
            TopAppBar(title = {Text(stringResource(R.string.app_name),
                color = Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(
                    colorResource(id = R.color.purple_500))
            )
            }) {
                isiRuang ->

                Column(
                    modifier = Modifier.padding(isiRuang),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    //edit 3 : value, onValueChange, selected, onClick
                    OutlinedTextField(
                        value = txtNama,
                        singleLine = True,
                        shape = MaterialTheme.shapes.medium,
                        modifier = Modifier.width(250.dp).padding(top = 20.dp),
                        label = {Text(text = "Nama Lengkap")},
                        onValueChange = {
                            txtNama = it
                        }
                    )
                }
            }
)