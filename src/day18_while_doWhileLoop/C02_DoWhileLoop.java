package day18_while_doWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
         /*
        Soru 7 ) Kullanicidan bir sayi alin
        ve bu sayinin rakamlari toplamini yazdirin
         */



        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen rakamlarini toplatmak istediginiz bir sayi giriniz");
        int sayi=scan.nextInt();

        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int temp=sayi;
        while (temp>0){
            birlerBasamagi=temp%10;
            rakamlarToplami+=birlerBasamagi;
            temp/=10;
        }

        System.out.println("girdiginiz "+sayi +" sayisinin rakamlari toplami: "+rakamlarToplami);
    }
}
