package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {
        /* Marketteki tum urunleri
        bir array de tuttugumuzu varsayalim
         */

        String[] urunler={"NUtella","Cokokrem","Sut","Cay","Findik"};

        Scanner scan= new Scanner(System.in);
        System.out.println("istediginiz urunun sira nosunu giriniz");
        try {
            int istenenIndex=scan.nextInt();
        } catch (InputMismatchException e) {
            throw new RuntimeException(e);
        }

    }
}
