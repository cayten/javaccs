package odev_01;

import java.util.Scanner;

public class P03_Odev {
    public static void main(String[] args) {
        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ekrana \"Y\" ya da \"N\" yaziniz");
        char harf=scan.next().charAt(0);

        if (harf=='Y' || harf=='y'){

            System.out.println("girilen ifade YES");

        } if (harf=='N' || harf=='n'){
            System.out.println("girilen ifade NO");


        }else{
            System.out.println("lutfen gecerli bir harf giriniz");
        }














    }
}
