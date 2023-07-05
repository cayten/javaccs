package practice_01;

import java.util.Scanner;

public class P02_Odev {
    public static void main(String[] args) {


        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin



        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen adinizi giriniz");
        String isim= scan.next().toUpperCase();

        System.out.println("lutfen dogum yerinizi giriniz");
        String dogumYeri= scan.next().toUpperCase();

        System.out.println("lutfen yasadiginiz ili giriniz");
        String konum= scan.next().toUpperCase();

        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        System.out.println("litfen boyunuzu giriniz");
        double boy= scan.nextDouble();

        System.out.println("yasadiginiz ili seviyor musunuz?");
        boolean secenek=scan.nextBoolean();

        System.out.println("isminiz: "+isim+ "\n dogumYeri: " + dogumYeri + "\n yasadiginiz il: "+ konum+ "\n yasiniz: "+ yas+ "\n boyunuz: "+boy + "\n seviyor mu ? " + true);

    }
}
