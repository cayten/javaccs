package practice_02;

import java.util.Scanner;

public class P01_odev {
    public static void main(String[] args) {

        // kullanicidan 2 tam sayi alin
        // bu tam sayilari toplayin ve sonucu yazdirin

        Scanner scan = new Scanner(System.in);
       /* System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println("lutfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        System.out.println("sayilarin toplami: " + (sayi + sayi2));*/

        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        System.out.println("lutfen adinizi giriniz");
        String isim= scan.next().toUpperCase();

        System.out.println("lutfen dogum yerinizi giriniz");
        String dogumYeri= scan.next().toUpperCase();

        System.out.println("lutfen yasadiginiz ili giriniz");
        String konum= scan.next().toUpperCase();

        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        System.out.println("litfen buyunuzu giriniz");
        double boy= scan.nextDouble();

        System.out.println("yasadiginiz ili seviyor musunuz?");
        boolean secenek=true;

        System.out.println("isminiz: "+isim+ "\n dogumYeri: " + dogumYeri + "\n yasadiginiz il: "+ konum+ "\n yasiniz: "+ yas+ "\n boyunuz: "+boy + "\n seviyor mu ? " + true);





    }
}
