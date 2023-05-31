package odev_02;

import java.util.Scanner;

public class P07_Odev {
    public static void main(String[] args) {


        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */



        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime=scan.nextLine().toLowerCase();


        if (kelime.contains("xyz")){
            System.out.println("true");
        }else
            System.out.println("false");




    }
}
