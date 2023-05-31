package day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {



    /*
              kullanicidan toplanmak uzere sayilar alin


             sayilarin toplami 500'u gecince (500 dahil)

              sayilarin toplamini ve kac sayi toplandigini su sekilde yazdirin

              13 sayi girdinz ve toplamlari 567

             */
        int toplam = 0;
        int sayac = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen toplamak istediginiz ilk sayiyi giriniz");
        int sayi = scan.nextInt();
        while (toplam <= 500) {
            System.out.println("lutfen toplama eklemek istediginiz yeni sayiyi giriniz");
            sayi = scan.nextInt();


            toplam += sayi;
            sayac++;


        }
        System.out.println(sayac + " adet sayi girdiniz ve girdiginiz sayilarin toplami = " + toplam);

    }

}













