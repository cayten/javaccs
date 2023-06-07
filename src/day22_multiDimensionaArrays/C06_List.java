package day22_multiDimensionaArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {

        /*

        array i array yapan sembol [] idi
        arrayList de ise <> diamond(elmas) kullaniriz

         */


        List<String> isimler=new ArrayList<>();
        System.out.println(isimler);//[]

        //listeye isim eklmek istersek
        isimler.add("canan");
        isimler.add("cuneyt");
        System.out.println(isimler);//[canan, cuneyt]

        System.out.println(isimler.add("katre"));//true
        System.out.println(isimler);//[canan, cuneyt, katre]

        /*
        List in tek kotu tarafi array in alt yapisini kullandigi icin elemanlari tek tek eklemek zorundayiz
         */
/*

        String de bir method calistirdigimizda
        assign yapmazsak String degismiyordu

        String isim="canan";

       isim.toUpperCase();

        System.out.println(isim);


 */


    }
}
