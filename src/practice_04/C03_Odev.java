package practice_04;

import java.util.Scanner;

public class C03_Odev {
    public static void main(String[] args) {
      /*
cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
 */


        birim();




    }
    public static void birim(){
        Scanner scan=new Scanner(System.in);
        System.out.println("donusturmek istediginiz birimi giriniz");
        double deger=scan.nextDouble();
        double metre=deger/100;
        double kMetre=metre/100;
        System.out.println("girdiginiz degerin sonucu: " + kMetre + "km "+metre +"m ");
    }

}
