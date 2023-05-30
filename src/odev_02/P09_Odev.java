package odev_02;

import java.util.Scanner;

public class P09_Odev {
    public static void main(String[] args) {

   /*
Kullanicidan bir kelime girmesini isteyin.
* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
* kelimenin ortasindaki karakteri yazdirin.
*/


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime=scan.nextLine().toLowerCase();



        if (kelime.length()%2==1 && kelime.length()>=3 ){
            System.out.println(kelime.substring(kelime.length()/2,(kelime.length()/2)+1));
        }else
            System.out.println("lutfen tek sayida karakter iceren kelime giriniz");


    }
}
