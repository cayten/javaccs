package day35_inheritancedaConsuctorKullanimi;

public class B2Muhasebe extends B1Personel {
    B2Muhasebe(){
        System.out.println("Muhasebe parametresiz cons");
    }
    B2Muhasebe(String isim){
        System.out.println("Muhasebe parametreli cons");
    }
}