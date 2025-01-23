package org.example.first_parser

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main() {

    val doc: Document = Jsoup.connect(URL).get()
    val qotes = doc.select(".sc-14uz67c-0.ccmjFA")

    for (qote in qotes) println("${qote.text()}\n")
}

const val URL = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
