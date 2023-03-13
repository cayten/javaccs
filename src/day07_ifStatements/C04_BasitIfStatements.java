package day07_ifStatements;

import java.util.Scanner;

public class C04_BasitIfStatements {
    public static void main(String[] args) {

         /*
       Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
       Ornek:  gun=Pazar output = "Hafta sonu"
       gun=Sali output = "Hafta ici"
*** String icin equals method'unu kullanin

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Gun Ismi Giriniz");
        String gun = scan.nextLine().toLowerCase();

        if (gun.equals("pazar")|| gun.equals("cumartesi")){

            System.out.println("Girilen Gun HASTA SONU");
        }
        if (gun.equals("pazartesi")||gun.equals("salı")||gun.equals("çarşamba")||gun.equals("perşembe")||gun.equals("cuma")){

            System.out.println("Girilen Gun HAFTA İCİ");
        }

        if (gun.equals("pazartesı")||gun.equals("sali")||gun.equals("carsamba")||gun.equals("persembe")||gun.equals("cuma")){

            System.out.println("Girilen Gun Gecersizdir");
        }




    }
}
