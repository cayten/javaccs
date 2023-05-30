package day15_overloading_foorlop;

public class C03_Overloading {
    public static void main(String[] args) {

        topla(4,5);
        topla(3.5,5);
        topla(3.5,6.6);
    }



    public static void topla(int sayi1, int sayi2){

        System.out.println(sayi1+sayi2);

    }
    public static void topla(double sayi1, double sayi2){

        System.out.println(sayi1+sayi2);

    }
    public static void topla(int sayi1, double sayi2){

        System.out.println(sayi1+sayi2);

    }
   /*
   Bir class da parametre sayisi ve parametre turleri ayni olan 2 method OLUSTURAMAIZ

    public static void topla(int sayi3, int sayi4){


        System.out.println(sayi1+sayi2);

    }*/













}
