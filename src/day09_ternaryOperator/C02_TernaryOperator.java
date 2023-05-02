package day09_ternaryOperator;

import java.util.Scanner;

public class C02_TernaryOperator {
    public static void main(String[] args) {

        // Kullancidan bir sayi alin
        //sayi pozitifse sayi pozitif yazdirin negatifse sayinin karesini yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");

        double sayi= scan.nextDouble();
        System.out.println( "sayiniz :" + (sayi>0 ? "sayi pozitiftir" :(sayi*sayi)));
    }
}
