package practice_04;

import java.util.Scanner;

public class C05_Odev {
    public static void main(String[] args) {
        /*
Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.

   0-1-1-2-3-5-8-13-21-34....
   */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 47 den kucuk bir sayi giriniz");
        int sayi=scan.nextInt();
   fibonacci(sayi);




    }
    public static void fibonacci(int sayi){
        int sayi1=0;
        int sayi2=1;
        int sayi3;
        System.out.print(sayi1+" "+sayi2+" ");

        if (sayi<47){
            for (int i = 2; i < sayi; i++) {
                sayi3=sayi1+sayi2;
                System.out.print(sayi3+" ");
                sayi1=sayi2;
                sayi2=sayi3;



            }

        }else System.out.println("lutfen gecerli bir sayi giriniz");
    }
}
