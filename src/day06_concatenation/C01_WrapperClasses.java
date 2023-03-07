package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        /*
       Wrapper class javanin hazir methodlari kullanabilmemiz için
          primitive data turlerinin herbiri çin actigi class lardir
         int--> Integer
         char--> Character
         digerleri primitive data turu ile ayni sadece bas harfi buyuk
         */

        String isim = "cananayten";
        System.out.println(isim.toUpperCase());

        Boolean guzelMi = true;
        System.out.println(guzelMi.toString());

        String no = "123456a";
        System.out.println(no.length());

        System.out.println(no.getBytes().toString());

        System.out.println(no.contains("b"));

        System.out.println(no.equals("123456a"));
        System.out.println(no.equals("12345"));


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayı giriniz");
        String sayi = scan.next();
        Integer sayiRakam = Integer.parseInt(sayi);

        System.out.println("girilen String ifade : " + sayi + 3);
        System.out.println("cevirilen sayi : " + (sayiRakam + 3));

    }
}
