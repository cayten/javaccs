package practice_03;

import java.util.Scanner;

public class C03_Odev {
    public static void main(String[] args) {
        /*
 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
 *
BMI = kilo(kg) /(boy*boy)(m)
BMI <=20 oldukca zayifsiniz
20<BMI<=25 Normal sinirlardasiniz
25<BMI<=30 Sisman kategorisindesiniz
30<BMI ==> Obez grubundasiniz.*/



        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz");
        double kilo=scan.nextDouble();

        System.out.println("lutfen boyunuzu giriniz");
        double boy=scan.nextDouble();

        double bmiHesaplama=kilo/((boy*boy)/10000);

        if (bmiHesaplama <=20){
            System.out.println("oldukca zayifsiniz");
        } else if (bmiHesaplama>20 && bmiHesaplama<=25) {
            System.out.println("normal sinirdasiniz");

        } else if (bmiHesaplama>25 && bmiHesaplama<=30) {
            System.out.println("sismansiniz");

        }else
            System.out.println("obezsini");


    }
}
