package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz:");
        int yas = scan.nextInt();

        if (yas<0){
            System.out.println("lutfen gecerli bir sayi giriniz:");


        } else if (yas<65) {
            System.out.println("emekli olamazsın,calısmalisin" + " " + (65-yas)+ " "+"yil daha calısmalisiniz");

        } else if (yas>=65 && yas<125) {
            System.out.println("emekli olabilirsiniz");

        }else {
            System.out.println("olmus olmaniz gerekiyor");
        }
    }
}
