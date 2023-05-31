package day14_methodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {


        C02_MethodCreation.rakamlariTopla(234);

        //Input olarak verilen isim ve soyismi
        // ilk harfi buyuk,geriye kalan harfler * olacak sekilde
        //I****  K***** seklinde yazdiran bir method olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim = scan.next();

        System.out.println("lutfen soyadisnizi girinz");
        String soyIsim = scan.next();

        yildizliHarfler(isim);
        yildizliHarfler2(soyIsim);


    }


    public static void yildizliHarfler(String isim) {


        System.out.println(isim.substring(0, 1).toUpperCase());
        System.out.println(isim.substring(1).replaceAll("\\w", "*"));


    }

    public static void yildizliHarfler2(String soyisim) {


        System.out.println(soyisim.substring(0, 1).toUpperCase());
        System.out.println(soyisim.substring(1).replaceAll("\\w", "*"));

    }
}
