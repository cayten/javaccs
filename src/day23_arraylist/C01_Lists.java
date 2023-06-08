package day23_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(10);
        sayilar.add(2,15);
        sayilar.add(12);
        System.out.println(sayilar);//[5, 2, 15, 10, 12]
        System.out.println("sayilar listesinin boyutu = " + sayilar.size());//5
        sayilar.addAll(sayilar);
        System.out.println(sayilar);//[5, 2, 15, 10, 12, 5, 2, 15, 10, 12]

        sayilar.add(2,8);
        System.out.println(sayilar);//[5, 2, 8, 15, 10, 12, 5, 2, 15, 10, 12]
        sayilar.set(2,10);
        System.out.println(sayilar);//[5, 2, 10, 15, 10, 12, 5, 2, 15, 10, 12]
        System.out.println(sayilar.set(3,5));//15
        System.out.println(sayilar);//[5, 2, 10, 5, 10, 12, 5, 2, 15, 10, 12]
 /*
         set method'u istenen index'deki eski elementi silip,
          yerine verdigimiz yeni elementi set eder.
          eger eski elementi silmek istemiyorsak,
          add(index,deger) method'unu kullanabiliriz
          set() sildigi eski elementi de bize dondurur
         */

    }
}
