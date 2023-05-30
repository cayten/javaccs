package odev_03;

import java.util.Scanner;

public class C07_Odev {
    public static void main(String[] args) {
        /*
   0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
  kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
  cikis "Gecersiz" olmalidir
  NestedIf ve Ternary kullanarak 2 yolla da cozunuz
*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir rakam giriniz");
        int rakam=scan.nextInt();

        if (rakam==0){
            System.out.println("sifir");
        } else if (rakam==1) {
            System.out.println("bir");

        } else if (rakam==2) {
            System.out.println("iki");

        } else if (rakam==3) {
            System.out.println("uc");

        } else if (rakam == 4) {
            System.out.println("dort");
        } else if (rakam==5) {
            System.out.println("bes");

        } else if (rakam==6) {
            System.out.println("alti");

        } else if (rakam==7) {
            System.out.println("yedi");

        } else if (rakam==8) {
            System.out.println("sekiz");

        } else if (rakam==9) {
            System.out.println("dokuz");

        }else
            System.out.println("girdiginiz sayi rakam degildir");


    }
}
