package com.example.materialdesigndemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.materialdesigndemo.ui.theme.MaterialDesignDemoTheme


@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialDesignDemoTheme {
                val name = remember { mutableStateOf("") }
                val email = remember { mutableStateOf("") }
                val message = remember { mutableStateOf("") }
                val showDialog = remember { mutableStateOf(false) }

                if (showDialog.value) {
                    DialogWithForm(
                        onDismissRequest = {showDialog.value = false},
                        onSubmit = {showDialog.value = false}
                    )
                }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                title = {
                                    Text(text = "Material Design Demo")
                                },
                                colors = TopAppBarDefaults.smallTopAppBarColors(
                                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                                    titleContentColor = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            )
                        },
                        floatingActionButton = {
                            FloatingActionButton(onClick = {showDialog.value = true}) {
                                Icon(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = "Add message",
                                    tint = MaterialTheme.colorScheme.onPrimaryContainer
                                )
                            }
                        },
                    ) { values ->
                        LazyColumn(contentPadding = values, userScrollEnabled = true) {
                            items(20) {
                                MessageCard(
                                    name.value,
                                    email.value,
                                    message.value
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun DialogWithForm(
    onDismissRequest: () -> Unit,
    onSubmit: () -> Unit,
) {
    Dialog(onDismissRequest = { onDismissRequest() }) {
        MessageForm(onDismissRequest = { onDismissRequest() })
    }
}