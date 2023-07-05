package practice_07;

import java.util.Scanner;

public class C04_Odev {
    public static void main(String[] args) {
        /*
 Kullanicidan aldigimiz 8 elemanli arrayin icinde
 kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
*/



        int [] sayilar=new int[8];
        
        
        for (int i = 0; i <sayilar.length ; i++) {
            Scanner scan=new Scanner(System.in);
            System.out.println("lutfen birinci sayiyi giriniz");
            int sayi=scan.nextInt();
            if (sayilar[i]%3==0){
                System.out.println("sayilar = " + sayilar[i]);

            }break;

        }



    }
}
