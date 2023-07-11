package day30_immutable;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {


    /* String mi yoksa StringBuilder mi daha hizlidir?
    BUnun icin bir string olusturup, 1000 kere sonuns . ekleyeylim
    Oncesinde ve sonrasinda zamani alip aradaki farki bulalim

    Ayni sekilde StringBuilder icin de yapalim
     */
    LocalTime baslangic= LocalTime.now();

    String str="Ahhhh Java";
        for (int i = 0; i < 1000; i++) {
            str+=".";

        }
        LocalTime bitis= LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String Builder Zaman: "+ (bitis.getNano()-baslangic.getNano()));

}
}