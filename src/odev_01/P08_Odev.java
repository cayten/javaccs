package odev_01;

import java.util.Scanner;

public class P08_Odev {
    public static void main(String[] args) {


        /*  Problem Tanımı
    Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
    Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
    120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

    Örnek Ekran Çıktısı
    Mesafeyi giriniz: 400
    Hızı giriniz: 100
    Süre 4 saattir.
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("ISTANBUL ILE ANKARA ARASI KAC KILOMETRE? ");
        double yol=scan.nextDouble();

        System.out.println("ortalama hizinizi giriniz");
        double hiz=scan.nextDouble();

        double sure= yol/hiz;
        System.out.println(sure);

    }
}
