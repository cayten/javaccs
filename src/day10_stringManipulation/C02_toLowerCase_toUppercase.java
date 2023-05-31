package day10_stringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUppercase {
    public static void main(String[] args) {

        String str="Beni Psikopata Baglamayin";
        System.out.println(str.toLowerCase()); //beni psikopata baglamayin
        System.out.println(str.toUpperCase()); // BENİ PSİKOPATA BAGLAMAYİN
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr"))); // Turkce karakterler icin




    }
}
