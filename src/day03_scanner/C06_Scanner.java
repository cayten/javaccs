package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // bir onceki soruyu tek seferde kullanicidan tum bilgileri alarak yapiniz

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isim, soyisim ve yasinizi giriniz /aralarda Enter tusuna basiniz:");
        String isim =scan.nextLine();
        int yas=scan.nextInt();
        System.out.println(" verilen bilgiler :" + isim + "" + " "+ yas);

    }
}
