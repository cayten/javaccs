package odev_02;

import java.util.Scanner;

public class P03_Odev {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz
       // ve bu iki kelimeyi String manipulation method kullanarak birlestiriniz.
       //yukardaki ornekte verilen ilk
       // ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim=scan.next();

        System.out.println("lutfen ikinci ismi giriniz");
        String isim2=scan.next();

        String birlesim=isim.concat(isim2);
        System.out.println(birlesim);

        isim=isim.substring(1);
        isim2=isim2.substring(1);

        System.out.println(isim.substring(0)+isim2.substring(0));













    }
}
