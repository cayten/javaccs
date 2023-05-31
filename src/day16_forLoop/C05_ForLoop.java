package day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        // Soru 10 ) Kullanicidan iki sayi isteyin.
        // Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        //sonucu yazdiran bir method
        // yaziniz


        sayiToplami();


    }

    private static void sayiToplami() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1.sayiyi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen 2.sayiyi giriniz");
        int sayi2=scan.nextInt();
        int toplam=0;
        if (sayi1<=sayi2){
            for (int i = sayi1; i <=sayi2 ; i++) {
                toplam+=i;
            }
        }else {
            for (int i = sayi2; i <=sayi1 ; i++) {
                toplam+=i;
            }
        }

        System.out.println("sayilarin toplami = " + toplam);
    }
}


