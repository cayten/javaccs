package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {
        int sayi=1054;
        sayi %=100;
        System.out.println(sayi);

        sayi%=10;
        System.out.println(sayi);

        //Kullanicidan 4 basamakli bir sayi aliniz ve bu sayinin rakamlari toplamini yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dort basamakli bir sayi giriniz:");
        int sayimiz= scan.nextInt();
        //2451
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int ilkGirilenSayi=sayimiz;

        birlerBasamagi=sayimiz%10;
        rakamlarToplami+=birlerBasamagi;
        sayimiz/=10;

        // bb=1 rt=1 sayimiz=245



        birlerBasamagi=sayimiz%10;
        rakamlarToplami+=birlerBasamagi;
        sayimiz/=10;

        // bb=5 rt=6 sayimiz=24




        birlerBasamagi=sayimiz%10;
        rakamlarToplami+=birlerBasamagi;
        sayimiz/=10;

        // bb=4 rt=10 sayimiz=2





        birlerBasamagi=sayimiz%10;
        rakamlarToplami+=birlerBasamagi;
        sayimiz/=10;

        // bb= rt=12 sayimiz=0

        System.out.println(rakamlarToplami);









    }
}
