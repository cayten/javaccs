package day09_ternaryOperator;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        // Soru2 : Kullanicidan bir harf isteyin
// kucuk harf ise consola "Kucuk Harf" ,
// buyuk harfse consola "Buyuk Harf"
// yoksa "girdiginiz karakter harf degil" yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);
        String sonuc=(harf>='a' && harf<='z') ? ("kucuk harf") : ((harf>='A'&& harf<='Z'))? "buyuk harf"
                : "girdiginiz karakter harf degil";

        System.out.println(sonuc);
    }
}
