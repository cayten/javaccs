package odev_02;

import java.util.Scanner;

public class P10_Odev {
    public static void main(String[] args) {


        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen adinizi giriniz");
        String isim=scan.nextLine();
        System.out.println("lutfen soyadinizi giriniz");
        String soyisim=scan.next();

        if (isim.length()>soyisim.length()){
            System.out.println(" adiniz soyadinizdan uzundur");
        }else if (isim.length()<soyisim.length()){
            System.out.println("adiniz soyadinizdan kisadir");
        }else
            System.out.println("adiniz ile soyadiniz esit uzunluktadir");


    }
}
