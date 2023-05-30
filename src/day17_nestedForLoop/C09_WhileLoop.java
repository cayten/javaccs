package day17_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
       /* Soru 6) Kullanicidan bir sifre girmesini isteyin.

                Asagidaki sartlari sagliyorsa "Sifre basari ile tanimlandi",

                sartlari saglamazsa "Islem basarisiz,Lutfen yeni bir sifre girin" yazdirin

        ve basarili sifre girinceye kadar tekrar sifre girmesini isteyin

                - Ilk harf buyuk harf olmali

        - Son harf kucuk harf olmali

        - Sifre bosluk icermemeli

        - Sifre uzunlugu en az 8 karakter olmali

         */

        Scanner scan=new Scanner(System.in);

        String sifre="";

        int kontrol=0;

        boolean sifreDogruMu=false;

        while (!sifreDogruMu){


            System.out.println("lutfen bir sifre giriniz");
            sifre=scan.nextLine();

            if (sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z'){

                kontrol++;
            }else {
                System.out.println("Ilk harf buyuk olmali");
            }
            if (sifre.charAt(sifre.length()-1)>='a'&& sifre.charAt(sifre.length()-1)<='z'){
                kontrol++;
            }else {
                System.out.println("Son harf kucuk olmali");

            }if (!(sifre.contains(" "))){

                kontrol++;}else {
                System.out.println("Sifre bosluk icermemeli");
            }

            if (sifre.length()<8){
                System.out.println("Sifre en az 8 karakterli olmali");
            }else {
                kontrol++;
            }
            if (kontrol==4){
                System.out.println("sifre basarili bir sekilde tanimlandi");
                sifreDogruMu=true;
            }else{
                kontrol=0;
            }

        }
    }
}
