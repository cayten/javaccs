package day03_scanner;

import java.util.Scanner;

public class C07_ScannerIlkHarf {
    public static void main(String[] args) {
        // kullanicidan ismini alip, ilk harfini buyuk harf olarak yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz:");
        char ilkHarf = scan.next().toUpperCase().charAt(0);
        System.out.println("girilen ismin ilk harfi" + " " + ilkHarf);

    }
}
