package day18_while_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {


        /*
         Kullanicidan toplamak uzere pozitif sayilar isteyin,
         islemi bitirmek icin 0’a basmasini soyleyin.
    Kullanici yanlislikla negative sayi girerse
    o sayiyi dikkate almayin ve "Negatif sayi giremezsiniz" yazdirip basa donun
    Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
    yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pozSayiAdedi=0;
        int negSayiAdedi=0;
        int pozSayiToplami=0;

        do {
            System.out.println("lutfen toplamak istediginiz tam sayiyi giriniz");
            sayi=scan.nextInt();
            if (sayi>0){
                pozSayiToplami+=sayi;
                pozSayiAdedi++;

            }else if (sayi<0){

                System.out.println("negatif sayi giremezsiniz");
                negSayiAdedi++;
            }



        }while (sayi!=0);

        System.out.println("girmis oldugunuz "+pozSayiAdedi+ " adet pozitif sayinin toplami ="+pozSayiToplami);
        System.out.println("toplama dahil edilmeyen "+negSayiAdedi +" adet negatif sayi girdiniz");











    }
}

