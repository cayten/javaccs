package day08_ifStatements;

import java.util.Scanner;

public class C02_IfElseStatement {
    public static void main(String[] args) {


        // Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        // Not'u harf sistemine cevirip yazdirin
        // 50’den kucukse "D",
        // 50 ye esit veya buyuk 60 dan kucukse "C",
        // 60a esit veya buyuk 80 den kucukse "B",
        // 80e esit veya uzerindeyse  ise "A"
        // gecersiz not girildiginde uyari verelim


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen 0 ile 100 arasında bir not giriniz");

        double not= scan.nextDouble();
        if (not>=0 && not<50){
            System.out.println("NOTUNUZ D");
        } else if (not>=50 && not<60) {
            System.out.println("NOTUNUZ C");

        } else if (not>=60 && not<80) {
            System.out.println("NOTUNUZ B");

        } else if (not>=80 && not<=100) {
            System.out.println("NOTUNUZ A");

        }else {
            System.out.println("lutfen gecerli bir not giriniz");
        }


    }
}
