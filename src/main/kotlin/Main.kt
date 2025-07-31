package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {
    val doc: Document = Jsoup.connect("https://www.livelib.ru/book/1007081008/quotes-avtostopom-po-galaktike-duglas-adams/").get()
    val elements: Elements = doc.select(".lenta-card p")

    for (element: Element in elements) {
        println(element.text())
    }
}