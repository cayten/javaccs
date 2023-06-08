package day23_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("tutku");
        urunler.add("cekirdek");
        urunler.add("biskrem");
        System.out.println(urunler);//[nutella, tutku, cekirdek, biskrem]
        System.out.println(urunler.indexOf("tutku"));//1
    /*
     indexOf method'u bize bilgi donduren bir method'dur
     listemizi degistirmez
     */
        urunler.add("tutku");//[nutella, tutku, cekirdek, biskrem, tutku]
        System.out.println(urunler);//
        System.out.println(urunler.lastIndexOf("tutku"));//4
    /*
     indexOf method'u urunu aramaya 0.index'den,
     lastIndexOf method'u ise aramaya son index'den baslar.
     arama bitip, urun bulundugundugunda,
     ikisi de bulunan urunun index'ini verir
     */

        System.out.println(urunler.indexOf("nero"));//-1
        System.out.println(urunler.lastIndexOf("nero"));//-1




    }
}
