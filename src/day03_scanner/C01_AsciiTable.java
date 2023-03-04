package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {

        int sayi = 2;
        char harf = 'a';
        String yazi = "banan";

        System.out.println(sayi+harf); // 99
        System.out.println(yazi+harf); // banana
        System.out.println(sayi+harf+yazi); // 99banan
        System.out.println(yazi+sayi+harf); // banan2a
        System.out.println(harf+2); // 99
        System.out.println(""+ harf + 2); // a2

             char deger = '3';
        System.out.println(harf+deger); // 148
    }
}
