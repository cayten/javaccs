package practice_02;

import java.util.Scanner;

public class P02_Odev {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi ve soy isminizi giriniz");
        String isim= scan.next().toUpperCase();
        String soyisim=scan.next().toUpperCase();
        System.out.println(isim+" " +soyisim);






    }
}
