package practice_03;

import java.util.Scanner;

public class C08_Odev {
    public static void main(String[] args) {
        /*
  Problem Tanımı :
  Basit 4 islem yapan bir hesap makinesi kodlayiniz....
  Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
  Kullanicidan iki sayi girmesini isteyiniz.
  Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
*/


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
        int sayi1=scan.nextInt();

        System.out.println("LUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECINIZ \n bolme : / \n carpma : * \n tolama : + \n cikarma : -");
        String islem= scan.next();

        System.out.println("lutfen ikinci sayiyi giriniz");
        int sayi2=scan.nextInt();
        switch (islem){
            case  "/":
                System.out.println("girmis oldugunuz sayilarin bolumu :" + sayi1/sayi2);
                break;

            case "*":
                System.out.println("girmis oldugunuz sayilarin carpimi :" + sayi1*sayi2);
                break;

            case "+":
                System.out.println("girmis oldugunuz sayilarin toplami :" + sayi1+sayi2);
                break;

            case "-":
                System.out.println("girmis oldugunuz sayilarin farki :" + (sayi1-sayi2));
                break;
            default:
                System.out.println("lutfen tekrar deneyiniz");
        }









    }
}
