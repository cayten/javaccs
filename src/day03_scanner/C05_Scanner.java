package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /*
           kullanicidan ismini soyismini ve yasini alip
           girilen bilgiler = canan ayten 33  seklinde yazdirin
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz: ");
        String ismin = scanner.nextLine();
        System.out.println("lütfen yasınızı giriniz: ");
        int yas = scanner.nextInt();
        System.out.println("girilen bilgiler : " + ismin + " " + yas);



    }
}
