package day13_MethodCreation;

import java.util.Scanner;

public class C01_StringManipulation {

    public static void main(String[] args) {
        //  Kullanicidan bir sifre girmesini isteyin.
        //        Asagidaki sartlari sagliyorsa "Sifre basari ile tanimlandi",
        //        sartlari saglamazsa "Islem basarisiz,Lutfen yeni bir sifre girin" yazdirin
        //        - Ilk harf buyuk harf olmali
        //        - Son harf kucuk harf olmali
        //        - Sifre bosluk icermemeli
        //        - Sifre uzunlugu en az 8 karakter olmali




        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sifre tanimlayiniz");
        String sifre=scan.nextLine();

        int kontrol=0;

        if (sifre.charAt(0)>='A' &&sifre.charAt(0)<='Z'){

            kontrol++;
        }else System.out.println("sifrenizin ilk harfi buyuk olmali");

        if (sifre.charAt(sifre.length()-1)>='a'&& sifre.charAt(sifre.length()-1)<='z'){
            kontrol++;

        }else {System.out.println("sifrenizin son harfi kucuk olmali");}
        if (!sifre.contains(" ")){
            kontrol++;
        }else {
            System.out.println("sifre bosluk icermemeli" );
        }if (sifre.length()>=8){
            kontrol++;
        }else {
            System.out.println("sifre en az 8 karakterli olmalidir");
        }



        if (kontrol==4){
            System.out.println("sifre basrili bir sekilde olusturuldu");
        }else {
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
        }
    }
}
