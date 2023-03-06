package day05_matematikselIslemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {
        /*
         pre veya post increment/decrement
          sadece ++ ve -- islemi icin gecerlidir
         bu iki islem icin sayidan sonra veya once yazilmasina gore farkli iki isleyis olur
         */

        int sayi1 = 10;
        int sayi2 = sayi1 + 1;

        sayi2 += 5;
        // sayi2= sayi1+5;

        int sayi3 = sayi2++;

        /*
       ++ veya -- variable'dan sonra olursa buna post....
       bu durumda o satirda yapilan iki islemden
       artirma veya azaltma islemi sonuncudur
       */

        System.out.println(sayi3);
        System.out.println(sayi2);

        int sayi4 = ++sayi3;
         /*
        eger ++ veya -- variable'dan once ise buna pre.... denir
         bu durumda o satirda yapilan iki islemden oncelikli olan
         artirma veya azaltmadir
            */

        System.out.println(sayi4);


    }
}
