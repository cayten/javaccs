package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreation {
    public static void main(String[] args) {
        /*
        eger bir class in icerisinde herhangi bir hesaplama yapip
        bunu da kalici olarak saklamak istersek
        kodumuzu sade ve anlasilir tutmak icin
        islemi bir method da yapip
        sonucunu main method a dondurebiliriz
        Return type i void olmayan bir method un sonucunu
        main method da bir variable a atama yaparsak
        programin geri kalaninda bu yeni degeri kullanma sansimiz olur

         */
//kullanicidan sehir ismini ve dogum tarihini alip
        //bunlari programda kullanacagimiz formatta bize donduren bir method olusturun
        //sehir ismini programimizda buyuk harf olarak,
        //tarihi ise 2022-06-30 seklinde kullanmak istiyoruz


        String sehirIsmi = sehirAl();
        String tarih=tarihAl();


        System.out.println("Girdiginiz sehirin ismi = " + sehirIsmi);
        System.out.println("Girdiginiz tarih : "+ tarih);

    }

    private static String sehirAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sehir ismini giriniz");
        String sehir = scan.next().toUpperCase();


        return sehir;


    }

    public static String tarihAl() {
        String tarih="";
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen dogdugunuz yili giriniz");
        int yil = scan.nextInt();


        if (yil < 1900 || yil > 2050) {
            System.out.println("lutfen gecerli bir yil giriniz");
        } else {
            tarih = yil + "-";
        }
        System.out.println("lutfen dogdugunuz ayi giriniz");
        int ay = scan.nextInt();
        if (ay < 1 || ay > 12) {
            System.out.println("lutfen gecerli bir ay giriniz");
        } else if (ay<10){

            tarih = tarih  + "0"+ ay + "-";
        }else {
            tarih=tarih+ay+"-";

        }
        System.out.println("lutfen dogdugunuz gunu giriniz");
        int gun = scan.nextInt();
        if (gun < 1 || gun > 31) {
            System.out.println("lutfen gecerli bir gun giriniz");
        } else if (gun<10) {
            tarih=tarih+"0"+gun;

        } else  {
            tarih = tarih+ gun;
        }
        return tarih;
    }

}








