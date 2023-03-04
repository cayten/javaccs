package day02_variables;

public class C02_Variables {

    public static void main(String[] args) {

        int sayi = 10;
        sayi = 20;

        System.out.println("sayimiz " + sayi);

        String isim = "cuneyt";
        String soyisim = "soylu";

        System.out.println(isim + " " + soyisim);

        double sayi1 = 3.5;
        double sayi2 = 6.7;
        double topla = sayi1 + sayi2;
        int topla2 = (int) (sayi1 + sayi2);
        System.out.println("double sonuc" + topla);
        System.out.println("int sonuc" + topla2);

        char rakam = '5';
        System.out.println(rakam);

        char harf = 'a';
        System.out.println(harf);

        System.out.println(harf + 1);

        int harf2 = 1;
        System.out.println(harf + harf2);
    }
}
