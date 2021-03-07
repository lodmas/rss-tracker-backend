package jskno.news.rsstracker.model;

import java.util.Arrays;
import java.util.List;

public enum Keywords {
    AUTONOMOS("Autónomos"),
    IMPUESTOS("Impuestos"),
    SUBVENCIONES("Subvenciones"),
    GASTO_PUBLICO("Gasto Público"),
    OKUPAS("Okupas"),
    VIVIENDA("Vivienda"),
    DESEMPLEO("Desempleo"),
    CORONAVIRUS("Coronavirus"),
    VACUNAS("Vacunas"),
    CIERRE_EMPRESAS("Cierre empresas"),
    GESTACION_SUBROGADA("Gestación subrogada"),
    CORRUPCION("Corrupción"),
    UNIVERSIDAD("Universidad");

    private List<String> literals;

    Keywords(String ...literals) {
        this.literals = Arrays.asList(literals);
    }

    public List<String> getLiterals() {
        return literals;
    }
}
