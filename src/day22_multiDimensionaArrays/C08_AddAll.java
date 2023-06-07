package day22_multiDimensionaArrays;

import java.util.ArrayList;
import java.util.List;

public class C08_AddAll {
    public static void main(String[] args) {

        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        System.out.println("sayilar1 = " + sayilar1);

        List<Integer> sayilar2=new ArrayList<>();
        sayilar2.add(10);
        sayilar2.add(15);
        sayilar2.add(16);
        sayilar2.add(20);
        System.out.println("sayilar2 = " + sayilar2);
        sayilar1.addAll(sayilar2);
        System.out.println("sayilar1 son = " + sayilar1);
        sayilar1.addAll(1,sayilar2);
        System.out.println("sayilar1 en son  = " + sayilar1);
        // bir listenin sonuna veya istedigimiz bir indexine,
        // baska bir collection ekleyebiliriz

    }
}
