package day09_ternaryOperator;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {


        // kullanicidan bir sayi isteyin
// sayi poztifse sayiyi yazdirin
// sayi sifir veya negatifse, bir sayi daha isteyin ve ikisinin carpimini yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();

        if (sayi>0){
            System.out.println(sayi);
        }else{
            System.out.println("yeni bir sayi giriniz");
            double sayi2=scan.nextDouble();
            System.out.println(sayi*sayi2);
        }


    }
}
