package practice_03;

import java.util.Scanner;

public class C06_Odev {
    public static void main(String[] args) {
/*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

    Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun giriniz");
        String gun=scan.next();

        switch (gun) {
            case "pazartesi":
            case "sali":
                System.out.println("java dersi gunleri");

                break;

            case "persembe":
            case "cuma":
                System.out.println("selenyum dersi gunleri");
                break;

            case "carsamba":
            case "cumartesi":
                System.out.println("SQL dersi gunleri");
                break;

            default:
                System.out.println("lutfen gecerli bir gun giriniz.");
        }




    }
}
