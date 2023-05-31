package odev_01;

import java.util.Scanner;

public class P04_Odev {
    public static void main(String[] args) {


           /*
              not hesaplayici
              A => 90 ~100
              B => 80 ~ 89
              C => 70 ~ 79
              D => 60 ~ 69
              F =>  0 ~ 59
          */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen aldiginiz notu giriniz");

        double not=scan.nextDouble();
        if (not>=90 && not<=100){
            System.out.println("notunuzun harf karsiligi \"A \"");
        }else if (not<90 && not>=80){
            System.out.println("notunuzun harf karsiligi \"B\"");
        }else if (not<80&& not >=70){
            System.out.println("notunuzun harf karsiligi \"C\"");
        }else if (not<70 && not>=60){
            System.out.println("notunuzun harf karsiligi \"D\"");
        }else if (not<60 && not>=0){
            System.out.println("notunuzun harf karsiligi \"F\"");
        }else {
            System.out.println("lutfen gecerli bir not giriniz");
        }






    }
}
