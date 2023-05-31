package day10_stringManipulation;

public class C05_Length {
    public static void main(String[] args) {


        String str = "java ogren , isi kap";

        System.out.println(str.length()); //20 str nin karakter sayisini dondurur
        System.out.println(str.charAt(str.length()-1)); //son karakterini yazdiralim p
        System.out.println(str.charAt(str.length()-3)); //sondan ucuncu karakteri yazdiralim

        String str2=""; //str2 ye bir deger atanmis midir.EVET
        // bu deger nedir: hiclik

        System.out.println(str2.length());// 0
        String str3=null;//str3 ye bir deger atanmis midir.HAYIR
        // null bu deger atamamayi isaret etmektedir
        System.out.println(str3.length());// bir deger atanmamis ki nasil uzunlugu olsun
        //NullPointerException olarak hata verir






    }
}
