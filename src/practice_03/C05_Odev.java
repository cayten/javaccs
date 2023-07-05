package practice_03;

import java.util.Scanner;

public class C05_Odev {
    public static void main(String[] args) {
        /*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen final harf notunuzu giriniz");
        char not=scan.next().charAt(0);
        String sonuc= not=='A' ? " Gayet Basarili" : not=='B' ? "asarili" : not=='C' ? "Ha Gayret" : "Digerleri";
        System.out.println(sonuc);




    }
}
