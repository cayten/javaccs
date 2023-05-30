package day12_stringManipulation;

public class C03_Substring {
    public static void main(String[] args) {


        String isim = "Suleyman";
        String soyisim = "Karanfili";
        String kartNo = "1234 6589 7458 9658";

        System.out.println(isim.substring(2));//leyman
        System.out.println(soyisim.substring(soyisim.length()-3));//ili
        System.out.println(isim.substring(2,5));//ley

       // isim ve soyismin ilk harfi buyuk harf,geriye kalan*
       //kredi kartinin ilk 4 harfi görünsün geriye kalan *


        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriKalanlar=isim.substring(1).replaceAll("\\w","*");

        String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriKalanlar=soyisim.substring(1).replaceAll("\\w","*");

        String kno=kartNo.substring(0,4);
        String kgeriKalan=kartNo.substring(4).replaceAll("\\d","*");

        System.out.println(isimIlkHarf+isimGeriKalanlar+" "+soyisimIlkHarf+soyisimGeriKalanlar+" "+kno+kgeriKalan);







    }
}
