package odev_04;

import java.util.Scanner;

public class C02_Odev {
    public static void main(String[] args) {
        /*
input olarak verilen bir tamsayi icin faktoriyel hesaplayayip
yazdiran bir method olusturun

verilen sayi negatif veya 20 den buyuk olursa
"girilen sayinin faktoriyeli hesaplanamaz"
 uyarisi yazdirin
 */

     faktoriyelHesaplama();

    }
    public static void faktoriyelHesaplama(){
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi girinz");
        int sayi = scan.nextInt();
        if (sayi<0||sayi>20){
            System.out.println("girilen sayinin faktoriyeli hsaplanamaz");

        }else {
            int sonuc = 1;
            for (int i = 1; i <= sayi; i++) {
                sonuc *= i;


            }
            System.out.println(sayi + "!: " + sonuc);
        }
    }
}
