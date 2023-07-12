package day31_timeFormatter;

public class C02_Vargars {

    public static void main(String[] args) {
        // verilen 2 int'i toplayip sonucu yazdiran bir method olusturun
        toplaYazdir(4,5,7);
    }
    public static void toplaYazdir(int sayi1 ,int sayi2){
        System.out.println("Verilen sayilarin toplami =" +(sayi1+sayi2));
    }
    public static void toplaYazdir(int sayi1 ,int sayi2,int sayi3){
        System.out.println("Verilen sayilarin toplami =" +(sayi1+sayi2+sayi3));
    }
    public static void toplaYazdir(int sayi1 ,int sayi2,int sayi3,int sayi4){
        System.out.println("Verilen sayilarin toplami =" +(sayi1+sayi2+sayi3+sayi4));
    }
}
