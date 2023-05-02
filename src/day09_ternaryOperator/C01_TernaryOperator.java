package day09_ternaryOperator;

import java.util.Scanner;

public class C01_TernaryOperator {
    public static void main(String[] args) {


        // Kullanicidan bir sayi alin ve sayinin mutlak degerini yazin


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();
        System.out.println("girdiginiz sayinin mutlak degeri:" + (sayi>=0 ? sayi : (sayi*-1)    ));

    }
}
