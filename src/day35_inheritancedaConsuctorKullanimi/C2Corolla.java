package day35_inheritancedaConsuctorKullanimi;

public class C2Corolla extends C1Toyota {
    C2Corolla() {
        System.out.println("CCorolla Parametresiz cons");
    }

    C2Corolla(String isim) {
        super(isim);
        System.out.println("CCorolla Parametreli cons");
    }
}