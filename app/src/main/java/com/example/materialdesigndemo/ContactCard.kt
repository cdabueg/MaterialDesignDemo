//package com.example.materialdesigndemo
//
//import androidx.compose.foundation.layout.*
//import androidx.compose.material3.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//import com.example.materialdesigndemo.ui.theme.TestRed
//
//
//@Composable
//fun ContactCard(
//    name: String,
//    email: String,
//    message: String,
//    modifier: Modifier = Modifier
//){
//    Card(
//        modifier = modifier,
//        colors = CardDefaults.cardColors(
//            containerColor = MaterialTheme.colorScheme.background,
//        ),
//        shape = MaterialTheme.shapes.large
//    ){
//        Column(
//            modifier = Modifier.padding(16.dp)
//        ) {
//            Text(
//                text = name,
//                style = MaterialTheme.typography.bodyLarge,
//                color = TestRed
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//            Text(
//                text = email,
//                style = MaterialTheme.typography.bodyLarge
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//            Text(
//                text = message,
//                style = MaterialTheme.typography.bodyLarge
//            )
//            Spacer(modifier = Modifier.height(8.dp))
////            Flowrow(
////                modifier = Modifier.fillMaxWidth(),
////                mainAxisSpacing = 8.dp,
////                // mainAxisSize = SizeMode.Wrap
////            ){
////
////            }
//        }
//    }
//}

package com.example.materialdesigndemo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.materialdesigndemo.ui.theme.TestRed
import kotlin.random.Random

@ExperimentalMaterial3Api
@Composable
fun ContactCard(
    name: String,
    email: String,
    message: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        shape = MaterialTheme.shapes.large
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = name,
                style = MaterialTheme.typography.bodyLarge,
                color = TestRed
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = email,
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = message,
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}