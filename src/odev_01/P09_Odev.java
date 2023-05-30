package odev_01;

import java.util.Scanner;

public class P09_Odev {
    public static void main(String[] args) {

        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kilonuzu yaziniz");
        double kilo=scan.nextDouble();
        System.out.println("lutfen boyunuzu metre cinsinden giriniz");
        double boy=scan.nextDouble();

        double vki=kilo/(boy*boy);

        System.out.println("vucut kitle indeksiniz: " + vki);







    }
}
