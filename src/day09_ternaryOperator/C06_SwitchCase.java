package day09_ternaryOperator;

import java.util.Scanner;

public class C06_SwitchCase {

    public static void main(String[] args) {


        /*
         Kullanicidan gun ismini alin
         hafta ici veya hafta sonu oldugunu yazdirin
          */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir gun giriniz");
        String gun = scan.next().toUpperCase();

        switch (gun) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("hafta ici");


                break;
            case "pazar":
            case "cumartesi":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("lutfen gecerli bir gun giriniz");

        }


    }
}
