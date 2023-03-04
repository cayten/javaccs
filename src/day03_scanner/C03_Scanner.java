package day03_scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bir Veri Giriniz:");
        String veriGir= scan.next();
        System.out.println("Girdiginiz Veri: "+ veriGir);

    }
}
