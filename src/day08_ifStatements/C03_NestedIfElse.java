package day08_ifStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {

      /*
  emeklilik kontrolu yapan bir program yaziniz
  cinsiyet olarak E (erkek) veya K(Kadin) degiskenlerini kabul etsin
  farkli bir harf veya sembol girilirse hata mesajji versin
  emeklilik icin kadinlarda yas siniri 60
  erkeklerde 65 olsun
  negatif yas veya 80'den buyuk yas girilirse hata mesaji versin
 */


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz");

        String cinsiyet=scan.next().toLowerCase();
        if (cinsiyet.equals("e")|| cinsiyet.equals("k")){
            System.out.println("lutfen yasinizi griniz");

            int yas=scan.nextInt();

            if (cinsiyet.equals("e")){
                if (yas<0 || yas>80){
                    System.out.println("lutfen gecerli bir yas giriniz");
                } else if (yas<65) {
                    System.out.println("emekli olamazsınız");

                }else {
                    System.out.println("emekli olabilirsiniz");
                }
            } else if (cinsiyet.equals("k")) {
            }
            {
                if (yas<60){
                    System.out.println("emekli olamazsınız");
                }else {
                    System.out.println("emekli olabilirsiniz");
                }
                }
            }
        }
















    }

