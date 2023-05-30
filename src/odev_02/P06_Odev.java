package odev_02;

import java.util.Scanner;

public class P06_Odev {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birinci kelimeyi giriniz");
        String kelime1=scan.next().toLowerCase();

        System.out.println("lutfen ikinci kelimeyi giriniz");
        String kelime2=scan.next().toLowerCase();

        System.out.println("lutfen ucuncu kelimeyi giriniz");
        String kelime3=scan.next().toLowerCase();

        System.out.println("lutfen dorduncu kelimeyi giriniz");
        String kelime4=scan.next().toLowerCase();

        System.out.println(kelime1.substring(0,1).toUpperCase()+ kelime1.substring(1)+" " +kelime2+" " +kelime3+" " +kelime4+".");







    }
}
