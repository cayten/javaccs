package odev_01;

import java.util.Scanner;

public class P10_Odev {
    public static void main(String[] args) {


        /*
         * Kullanicidan alacaginiz vize vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("1. vize notunuzu giriniz");
        double not1=scan.nextDouble();
        System.out.println("2. vize notunuzu giriniz");
        double not2=scan.nextDouble();
        System.out.println("final nbotunuzu giriniz");
        double not3=scan.nextDouble();

        double vizeOrt= (not1+not2)/2;
        double gecmeNotu= ((vizeOrt*30)/100) + (not3*70)/100;

        System.out.println("gecme notunuz: " + gecmeNotu);


    }
}
