package com.example.materialdesigndemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.materialdesigndemo.ui.theme.MaterialDesignDemoTheme


@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialDesignDemoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
//                        floatingActionButton = {
//                            FloatingActionButton(onClick = {}) {
//                                Icon(
//                                    imageVector = Icons.Default.Add,
//                                    contentDescription = null,
//                                    tint = MaterialTheme.colorScheme.onPrimaryContainer
//                                )
//                            }
//                        },
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
                        }
                    ) { values ->
                        LazyColumn(contentPadding = values, userScrollEnabled = true) {
                            items(20) {
                                ContactCard(
                                    name = "test name",
                                    email = "test@email",
                                    message = "test message")
                            }
                        }
                    }
                }
            }
        }
    }
}