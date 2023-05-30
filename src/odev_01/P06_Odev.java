package odev_01;

import java.util.Scanner;

public class P06_Odev {
    public static void main(String[] args) {
        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("urunun fiyatini giriniz");
        double fiyat=scan.nextDouble();
        if (fiyat >=0 && fiyat<10){
            System.out.println("ucuz");
        }else if (fiyat>=10 && fiyat<=20){
            System.out.println("normal");
        }else if(fiyat>20) {
            System.out.println("pahali");
        }else {
            System.out.println("lutfen gecerli bir tutar giriniz");
        }

          /*double fiyat=10;
          String sonuc=fiyat<10 ? "ucuz" : fiyat<20 ? "normal" : "pahali";
          System.out.println(sonuc);
           */




    }
}
