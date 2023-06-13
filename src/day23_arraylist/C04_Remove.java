package day23_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

    public static void main(String[] args) {
    /*
     remove method'u iki sekilde kullanilir
     1- objeyi yazip silmesini istersek bize boolean sonuc doner true/false
     2- index girersek o index'deki elemani siler ve bize silinen elemani dondurur
     */

        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("tutku");
        urunler.add("cekirdek");
        urunler.add("kola");
        urunler.add("hanimeller");
        System.out.println(urunler);//[nutella, tutku, cekirdek, kola]
        System.out.println(urunler.remove("tutku"));//true
        System.out.println(urunler);//[nutella, cekirdek, kola]
        System.out.println(urunler.remove("nero"));//false
        //index girerek silelim
        System.out.println(urunler.remove(1));//cekirdek
        System.out.println(urunler);//[nutella, kola]

        System.out.println(urunler.remove(3));//IndexOutOfBoundsException



    }

}
