package day18_while_doWhileLoop;

import java.util.Scanner;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
        /*
    Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
    ve baslangic harfinden baslayip bitis harfinde biten
    tum harfleri buyuk harf olarak ekrana yazdirin.
    Kullanicinin hata yapmadigini farz edin.
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangic harfini yaziniz");
        char ilkHarf=scan.next().charAt(0);
        System.out.println("Lutfen bitis harfini yaziniz");
        char sonHarf=scan.next().charAt(0);
   /* char ilkHarf='f';
    char sonHarf='t';

    */
        String buyukHarfler="";

        while (ilkHarf<=sonHarf){

            buyukHarfler=(ilkHarf+" ").toUpperCase();
            System.out.print(buyukHarfler+" ");
            ilkHarf++;
        }
    }
}
