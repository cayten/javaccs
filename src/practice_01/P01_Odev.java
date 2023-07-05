package practice_01;

import java.util.Scanner;

public class P01_Odev {
    public static void main(String[] args) {

        // kullanicidan 2 tam sayi alin
        // bu tam sayilari toplayin ve sonucu yazdirin

        Scanner scan = new Scanner(System.in);
       System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println("lutfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        System.out.println("sayilarin toplami: " + (sayi + sayi2));







    }
}
