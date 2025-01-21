package org.example.first_parser

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main() {

    val doc: Document = Jsoup.connect(URL).get()
    val quotes = doc.select("p")

    for (quote in quotes) println("${quote.text()}\n")
}

const val URL = "https://citaty.info/book/duglas-adams/restoran-u-konca-vselennoi"



