package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
          Kullanicidan tam sayilar alin
          kullanici cift sayi girdigi muddetce sayiyilari yazdirin
          tek sayi girdiginde islemi bitirin
         */

        Scanner scan=new Scanner(System.in);

        int sayi=0;
/*while (sayi%2==0){
    System.out.println("Lutfen bir sayi giriniz");
sayi=scan.nextInt();
if (sayi%2==0){
    System.out.println("girilen sayi cifftir"+sayi);

}else{
    System.out.println("girilen sayi tektir");
}

}

 */


        do {
            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0){
                System.out.println("girilen sayi cifftir"+sayi);

            }else{
                System.out.println("girilen sayi tektir");
            }

        }while (sayi%2==0);
    }
}
