package com.rlibanez.otherapirest

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SectionItem(section: Section) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = "Nombre: ${section.name}")
        Text(text = "h: ${section.h}")
        Text(text = "b: ${section.b}")
        Text(text = "tw: ${section.tw}")
        Text(text = "tf: ${section.tf}")
        Text(text = "r1: ${section.r1}")
        Text(text = "r2: ${section.r2}")
        section.hi?. let { Text(text = "hi: ${section.hi}") }
        Text(text = "d: ${section.d}")
        Text(text = "dmax: ${section.dmax}")
        Text(text = "emin: ${section.emin}")
        Text(text = "emax: ${section.emax}")
        Text(text = "pmin: ${section.pmin}")
        Text(text = "pmax: ${section.pmax}")
        Text(text = "iyc: ${section.iyc}")
        Text(text = "izc: ${section.izc}")
        Text(text = "ss: ${section.ss}")
        Text(text = "ys: ${section.ys}")
        Text(text = "ym: ${section.ym}")
        Text(text = "yS235: ${section.yS235}")
        Text(text = "yS355: ${section.yS355}")
        section.yS460?. let { Text(text = "yS460: ${section.yS460}") }
        Text(text = "xS235: ${section.xS235}")
        Text(text = "xS355: ${section.xS355}")
        section.xS460?. let { Text(text = "xS460: ${section.xS460}") }
        Text(text = "avz: ${section.avz}")
        Text(text = "iz: ${section.iz}")
        Text(text = "welz: ${section.welz}")
        Text(text = "wplz: ${section.wplz}")
        Text(text = "g: ${section.g}")
        Text(text = "a: ${section.a}")
        Text(text = "en1002522004: ${section.en1002522004}")
        Text(text = "en1002542004: ${section.en1002542004}")
        Text(text = "en102252001: ${section.en102252001}")
        Text(text = "wely: ${section.wely}")
        Text(text = "ag: ${section.ag}")
        Text(text = "wply: ${section.wply}")
        Text(text = "it: ${section.it}")
        Text(text = "iw: ${section.iw}")
        Text(text = "al: ${section.al}")
        Text(text = "iy: ${section.iy}")
    }
}