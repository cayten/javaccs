package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        int sayi1 = 30;  // swapten once sayi1
        int sayi2 = 40;  // swapten once sayi2
        int sayi3 = 0;  // swapten once sayi3

        sayi3 = sayi2;  // swapten sonra sayi 3
        sayi2 = sayi1;  // swapten sonra sayi 2
        sayi1 = sayi3;  // swapten sonra sayi 2

        System.out.println("swapten sonra sayi 1 : " + sayi1);
        System.out.println("swapten sonra sayi 2 : " + sayi2);


    }
}
