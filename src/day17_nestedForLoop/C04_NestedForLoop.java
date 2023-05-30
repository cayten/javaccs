package day17_nestedForLoop;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {
/*
    verilen input'a gore *'lardan olusan bir ucgen olusturun
    ornek input =4 ise
             *
             * *
             * * *
             * * * *
    */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin satir sayisini giriniz");
        int satir=scan.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
