package day05_matematikselIslemler;

import java.util.Scanner;

public class C04_RakamlarToplami {
    public static void main(String[] args) {

        // Kullanicidan 3 basamakli bir sayi aliniz ve bu sayinin rakamlarini toplayiniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamaklı bir sayi giriniz: ");
        int sayimiz = scan.nextInt();
        //654

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

         birlerBasamagi = sayimiz %10;
         rakamlarToplami+=birlerBasamagi;
         sayimiz /=10;

        // bb=4  rt=4 sayimiz=65

        birlerBasamagi = sayimiz %10;
        rakamlarToplami+=birlerBasamagi;
        sayimiz /=10;
        // bb=5  rt=9 sayimiz=6


        birlerBasamagi = sayimiz %10;
        rakamlarToplami+=birlerBasamagi;
        sayimiz /=10;
        // bb=6  rt=15 sayimiz=0

        System.out.println(rakamlarToplami);





    }
}
