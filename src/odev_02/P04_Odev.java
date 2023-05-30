package odev_02;

import java.util.Scanner;

public class P04_Odev {
    public static void main(String[] args) {

        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
// String  str 1= "$13.99"
// String str 2= "$10.55"
// ipucu: Double parseDouble() methodunu kullanabilirsiniz.




        String str1="$13.99";
        String str2="$10.55";

        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");

        Double sayi=Double.parseDouble(str1);
        Double sayi2=Double.parseDouble(str2);

        System.out.println("$"+(sayi+sayi2)/100);



    }
}
