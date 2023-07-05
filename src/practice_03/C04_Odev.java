package practice_03;

import java.util.Scanner;

public class C04_Odev {
    public static void main(String[] args) {
/*
Problem tanimi :
Kullanicidan  yasini ve kilosunu alaliniz
18 yasindan kucuk ise kan bagisi yapamaz
18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
18 yasindan buyuk ve 50 ve 50  kilodan agir ise kan bagisi yapabilir.
 */


   Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        double yas=scan.nextDouble();

        System.out.println(" lutfen kilonuzu giriniz");
        double kilo=scan.nextDouble();

        if (yas<18){
            System.out.println("kan bagisi yapamazsiniz");
        } else if (yas>18 && kilo<50) {
            System.out.println("kan bagisi yapamazsiniz");

        } else if (yas>=18&& kilo >=50) {
            System.out.println("kan bagisi yapabilirsiniz");
            
        }else
            System.out.println("lutfen gecerli bir deger giriniz");


    }
}
