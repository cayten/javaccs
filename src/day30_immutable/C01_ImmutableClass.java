package day30_immutable;

import java.util.*;

public class C01_ImmutableClass {
    public static void main(String[] args) {

        List<String> list= new ArrayList<>();

        list.add("Kenan");
        list.add("Enes");
        list.add("Ismail");
        System.out.println(list);// [Kenan, Enes, Ismail]

        list.set(1,"Yasemin");
        System.out.println(list); //[Kenan, Yasemin, Ismail]

        list.remove("Ismail");
        System.out.println(list);//[Kenan, Yasemin]


    }
}
