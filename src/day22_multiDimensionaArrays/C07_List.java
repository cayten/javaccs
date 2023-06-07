package day22_multiDimensionaArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        /*
List primitive data turlerini kabul etmez
(Type argument cannot be of primitive type)


 */

        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(3);
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(8);
        System.out.println(sayilar);//[5, 6, 3, 1, 2, 8]
        Collections.sort(sayilar);
        System.out.println(sayilar);//[1, 2, 3, 5, 6, 8]
// sadece add() kullanirsak Java sona ekler
// add(index,element) istedigimiz index e istedigimiz elementi yerlestirir
        //add methodu eski elementleri silmez veya update etmez,yeni element ekler
        sayilar.add(2, 9);
        System.out.println(sayilar);//[1, 2, 9, 3, 5, 6, 8]

    }
}