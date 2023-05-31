package day14_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {

        C01_MethodCreation.terstenYazdir("veli");


        //Verilen 3 basamakli bir sayinin
        //rakamlari toplamini yazdiran bir method olusturalim
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen uc basamakli bir sayi giriniz");
        int input=scan.nextInt();
        rakamlariTopla(input);

    }


    public  static void rakamlariTopla(int input){

        int birlerBasamagi=0;
        int rakamlariToplami=0;

        birlerBasamagi=input%10;
        rakamlariToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlariToplami+=birlerBasamagi;
        input/=10;
        birlerBasamagi=input%10;
        rakamlariToplami+=birlerBasamagi;
        input/=10;

        System.out.println("girdiginiz 3 basamakli sayinin rakamlari toplami :"+rakamlariToplami);


    }
}
