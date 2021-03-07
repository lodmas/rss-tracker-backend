package jskno.news.rsstracker.model;

public enum RssUrls {
//    ABC("https://www.abc.es/rss/feeds/abcPortada.xml"),
//    ABC_ULTIMA("https://www.abc.es/rss/feeds/abc_ultima.xml"),
//    EL_MUNDO("https://e00-elmundo.uecdn.es/elmundo/rss/portada.xml"),
//    EL_CONFIDENCIAL_ESPANA("https://rss.elconfidencial.com/espana/"),
//    EL_CONFIDENCIAL_MUNDO("https://rss.elconfidencial.com/mundo/"),
//    LA_VANGUARDIA_PORTADA("https://www.lavanguardia.com/newsml/home.xml"),
//    LA_VANGUARDIA_PORTADA("https://www.lavanguardia.com/feed/rss/home"),
//    EL_ECONOMISTA_ECONOMIA("https://www.eleconomista.es/rss/rss-economia.php"),
//    EL_ECONOMISTA_FLASH("https://www.eleconomista.es/rss/rss-flash-del-mercado.php"),
//    EL_ECONOMISTA_SELECCION("https://www.eleconomista.es/rss/rss-seleccion-ee.php"),
//    EXPANSION_PORTADA("https://e00-expansion.uecdn.es/rss/portada.xml"),
//    EXPANSION_ECONOMIA_POLITICA("https://e00-expansion.uecdn.es/rss/economiapolitica.xml"),
//    EXPANSION_ECONOMIA("https://e00-expansion.uecdn.es/rss/economia.xml"),
//    EUROPA_PRESS_PORTADA("https://www.europapress.es/rss/rss.aspx?_gl=1*iatgj5*_ga*MTcxMjcxNjg5OC4xNjA5MzE3MTM5*_ga_2HWC8HS3FS*MTYxMzU2MTYyOS41LjEuMTYxMzU2Mjc4Ny42MA.."),
//    EUROPA_PRESS_NACIONAL("https://www.europapress.es/rss/rss.aspx?ch=00066&_gl=1*iatgj5*_ga*MTcxMjcxNjg5OC4xNjA5MzE3MTM5*_ga_2HWC8HS3FS*MTYxMzU2MTYyOS41LjEuMTYxMzU2Mjc4Ny42MA.."),
//    EUROPA_PRESS_INTERNACIONAL("https://www.europapress.es/rss/rss.aspx?ch=00069&_gl=1*iatgj5*_ga*MTcxMjcxNjg5OC4xNjA5MzE3MTM5*_ga_2HWC8HS3FS*MTYxMzU2MTYyOS41LjEuMTYxMzU2Mjc4Ny42MA.."),
//    EUROPA_PRESS_ECONOMIA("https://www.europapress.es/rss/rss.aspx?ch=00136&_gl=1*iatgj5*_ga*MTcxMjcxNjg5OC4xNjA5MzE3MTM5*_ga_2HWC8HS3FS*MTYxMzU2MTYyOS41LjEuMTYxMzU2Mjc4Ny42MA.."),
//    ES_DIARIO_PORTADA("https://www.esdiario.com/rss/portada.xml"),
//    ES_DIARIO_ULTIMAS_NOTICIAS("https://www.esdiario.com/rss/articulos.xml"),
//    ES_DIARIO_LO_MAS_LEIDO("https://www.esdiario.com/rss/lo-mas-leido.xml"),
//    ES_DIARIO_ECONOMIA("https://www.esdiario.com/rss/economia/economia.xml"),
//    ES_DIARIO_ESPANA("https://www.esdiario.com/rss/secciones/espana.xml"),
//    ES_DIARIO_EL_MUNDO("https://www.esdiario.com/rss/secciones/mundo.xml"),
//    ES_DIARIO_TRIBUNALES("https://www.esdiario.com/rss/tribunales/tribunales.xml"),
//    EL_ESPANOL_CRONICA_GLOBAL_GENERAL("https://cronicaglobal.elespanol.com/es/rss/general-001.xml"),
//    EL_ESPANOL_CRONICA_GLOBAL_POLITICA("https://cronicaglobal.elespanol.com/es/rss/pol-tica-002.xml"),
//    OK_DIARIO("https://okdiario.com/feed"),
//    LIBERTAD_DIGITAL("http://rss.libertaddigital.com/libertaddigital/portada"),
//    GACETA("https://gaceta.es/feed/"),

    EL_DIARIO("https://www.eldiario.es/rss/"),
//    EL_PAIS_PORTADA("https://feeds.elpais.com/mrss-s/pages/ep/site/elpais.com/portada"),
//    EL_PAIS_ULTIMAS_NOTICIAS("http://ep00.epimg.net/rss/tags/ultimas_noticias.xml"),
//    EL_PAIS_MAS_VISTAS("http://ep00.epimg.net/rss/tags/noticias_mas_vistas.xml"),
//    EL_PAIS_INTERNACIONAL("https://feeds.elpais.com/mrss-s/pages/ep/site/elpais.com/section/internacional/portada"),
//    EL_PERIODICO_PORTADA("https://www.elperiodico.com/es/rss/rss_portada.xml"),
//    EL_PERIODICO_POLITICA("https://www.elperiodico.com/es/rss/politica/rss.xml"),
//    EL_PERIODICO_ECONOMIA("https://www.elperiodico.com/es/rss/economia/rss.xml"),
//    EL_PERIODICO_INTERNACIONAL("https://www.elperiodico.com/es/rss/internacional/rss.xml"),
//    EL_PLURAL("https://www.elplural.com/uploads/feeds/feed_elplural_es.xml"),
//    LA_SEXTA_NOTICIAS("https://www.lasexta.com/rss/351711.xml"),
//    RTVE_NOTICIAS("http://api2.rtve.es/rss/temas_noticias.xml"),
//    RTVE_ECONOMIA("http://api2.rtve.es/rss/temas_economia.xml"),
//    RTVE_ESPANA("http://api2.rtve.es/rss/temas_espana.xml"),
//    CINCO_DIAS_LO_ULTIMO("https://cincodias.elpais.com/rss/cincodias/ultimas_noticias.xml"),
//    CINCO_DIAS_LO_MAS_VISTO("https://cincodias.elpais.com/rss/cincodias/noticias_mas_vistas.xml"),
//    CINCO_DIAS_PYME("https://cincodias.elpais.com/rss/cincodias/territorio_pyme-f01.xml"),
//    CINCO_DIAS_MI_DINERO("https://cincodias.elpais.com/seccion/rss/midinero/"),





    ;



    private String url;

    RssUrls(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
