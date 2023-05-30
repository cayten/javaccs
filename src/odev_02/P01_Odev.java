package odev_02;

import java.util.Scanner;

public class P01_Odev {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 harfli bir kelime giriniz");
        String kelime= scan.nextLine().toUpperCase();
        String ilkHarf=kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);

        System.out.println(ilkHarf);


       /* String ikinciHarf=kelime.substring(1,2);
        String ucuncuHarf=kelime.substring(2,3);
        String dorduncuHarf=kelime.substring(3,4);
        System.out.println(dorduncuHarf+ucuncuHarf+ikinciHarf+ilkHarf);*/



    }
}
