package day03_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
            /*
          Kullanicidan ismini dogum yerini ve yasadıgı ili isteyip
          isminin 2.harfini büyük
          dogum yerinin 4. harfini kucuk
          yasadigi ilin 3.harfini buyuk yazdiriniz

          */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        char isimIkinciHarf = scan.next().toUpperCase().charAt(1);
        System.out.println("lutfen dogum yerinizi giriniz");
        char dogumYeriHarf = scan.next().toLowerCase().charAt(3);
        System.out.println("lutfen yasadiginiz ili giriniz");
        char yasagidiIlHarf = scan.next().toUpperCase().charAt(2);
        System.out.println("girilen veriler : " + " " + isimIkinciHarf + " " + dogumYeriHarf + " " + yasagidiIlHarf);


    }
}
