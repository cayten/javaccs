package day35_inheritancedaConsuctorKullanimi;

public class C1Toyota {

    C1Toyota(){
        System.out.println("CToyota Parametresiz cons");
    }
    C1Toyota(String isim){
        //super(isim); -> extends olmadigi icin super() cons call'u java kabul etmez
        System.out.println("CToyota Parametreli cons");
    }
}
