package day11_stringManipulation;

import java.util.Scanner;

public class C03_Contains {

    public static void main(String[] args) {
        /*

Soru 2) Kullanicidan bir cumle isteyin. Cumle "buyuk" kelimesi iceriyorsa
tum cumleyi buyuk harf olarak, "kucuk" kelimesi iceriyorsa
tum cumleyi kucuk harf olarak yazdirin,
iki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor" yazdirin.

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle yaziniz");
        String cumle=scan.nextLine();

        if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());

        }else System.out.println("cumle kucuk ya da buyuk kelimesi icermiyor");


    }
}
