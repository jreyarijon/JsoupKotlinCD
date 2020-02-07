import org.jsoup.Jsoup



object ElTiempo {
        val doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get()

        val grados = doc.getElementsByClass("today_nowcard-temp")
        val cielo = doc.getElementsByClass("today_nowcard-phrase")
        val titulo = doc.title()
        val grad = grados.text()
        val ciel = cielo.text()
}