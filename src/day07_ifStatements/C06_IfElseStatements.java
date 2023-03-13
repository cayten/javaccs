package day07_ifStatements;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {

        /*
       Kullaniciya yasini sorun
       eger yas 65
        den kucuk ise "emekli olamazsın,calıimalisin",
         65 e essit veya buyukse "Emekli olabilirsin " yazdirin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");

        int yas=scan.nextInt();
        if (yas<65){
            System.out.println("emekli olamazsın,calısmalisin" + " " + (65-yas)+"yil daha calısmalisiniz");
        }else {
            System.out.println("emekli olabilirsiniz");
        }






    }
}
