package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       /* System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();
        System.out.println("Lutfen yasınızı giriniz");
        int sayi = scan.nextInt();
        System.out.println("isminiz " + isim + " soyisminiz " + soyisim + " yasınız" + sayi);


            Kullanicidan iki sayi alip
            bu sayilarin carpimini yazdirin
        */

        System.out.println("Birinci sayiyi giriniz");
        double sayi1= scan.nextDouble();

        System.out.println("İkinci sayiyi giriniz");
        double sayi2= scan.nextDouble();

        System.out.println("İki sayının carpımı" + (sayi1*sayi2));

    }
}
