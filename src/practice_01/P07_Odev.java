package practice_01;

import java.util.Scanner;

public class P07_Odev {
    public static void main(String[] args) {
        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 5 basamakli bir sayi giriniz");
        int sayi= scan.nextInt();
         int ilkIki=sayi/1000;
         int sonIki=sayi%100;

        System.out.println(ilkIki+sonIki);







    }
}
