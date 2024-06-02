package com.rlibanez.otherapirest

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SectionItemTable(section: Section) {
    val customCardElevation = CardDefaults.cardElevation(
        defaultElevation = 8.dp,
        pressedElevation = 2.dp,
        focusedElevation = 4.dp
    )
    Card(
        modifier = Modifier
            .padding(horizontal = 0.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = customCardElevation,
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            section.name?.let {
                Text(
                    text = "Section: $it",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }

            DataTable(section)
        }
    }
}

@Composable
fun DataTable(section: Section) {
    val data = listOf(
        "h" to section.h,
        "b" to section.b,
        "tw" to section.tw,
        "tf" to section.tf,
        "r1" to section.r1,
        "r2" to section.r2,
        "emin" to section.emin,
        "emax" to section.emax,
        "iyc" to section.iyc,
        "izc" to section.izc,
        "ss" to section.ss,
        "ys" to section.ys,
        "ym" to section.ym,
        "yS235" to section.yS235,
        "yS355" to section.yS355,
        "yS460" to section.yS460,
        "xS235" to section.xS235,
        "xS355" to section.xS355,
        "xS460" to section.xS460,
        "avz" to section.avz,
        "iz" to section.iz,
        "welz" to section.welz,
        "wplz" to section.wplz,
        "g" to section.g,
        "a" to section.a,
        "en1002522004" to section.en1002522004,
        "en1002542004" to section.en1002542004,
        "en102252001" to section.en102252001,
        "wely" to section.wely,
        "ag" to section.ag,
        "wply" to section.wply,
        "it" to section.it,
        "iw" to section.iw,
        "al" to section.al,
        "iy" to section.iy
    ).filter { it.second != null }

//    Column {
//        data.chunked(1).forEach { rowItems ->
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(vertical = 4.dp)
//            ) {
//                rowItems.forEach { (label, value) ->
//                    RowItem(label = label, value = value.toString())
//                }
//            }
//        }
//    }

    Column {
        data.forEach { (label, value) ->
            RowItem(label = label, value = value.toString())
        }
    }

}

@Composable
fun RowItem(label: String, value: String) {
    Row(
        modifier = Modifier
            //.weight(1f)
            .padding(end = 4.dp)
            //.background(Color(0xFFF5F5F5), RoundedCornerShape(4.dp))
            .padding(4.dp)
    ) {
        Text(
            text = "$label: ",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
        Text(
            text = value,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
    }
}
