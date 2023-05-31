package day11_stringManipulation;

import java.util.Scanner;

public class C02_Contains {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan email adresini girmesini isteyin,
// mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
// @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
// @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

  Scanner scan=new Scanner(System.in);
        System.out.println("lutfen mail adresinizi giriniz");
        String mail=scan.nextLine();
        if (!mail.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        } else if (mail.lastIndexOf("@gmail.com")==mail.length()-10) {
            System.out.println("Email adresiniz kaydedildi");

        }else System.out.println("lutfen gmail adresi giriniz");


    }
}
