package odev_02;

import java.util.Scanner;

public class P11_Odev {
    public static void main(String[] args) {

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin
// olup olmadigini kontrol ediniz.
// Kullanicidan alacaginiz bir stringin bos olup olmadigini
// kontrol ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime=scan.nextLine().toLowerCase();

        if (kelime.indexOf(" ")==-1 && !kelime.isEmpty()) {
            System.out.println("bosluk yoktur");

        }else
            System.out.println("bosluk vardir");





    }
}
