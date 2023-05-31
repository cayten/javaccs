package day15_overloading_foorlop;

public class C06_StringTersCevirme {
    public static void main(String[] args) {
        //input olarak verilen  Stringi terse cevirip yazdiran bir method olusturun

        String isim="Cananim canimin ici";
        terstenYazdir(isim);

    }

    private static void terstenYazdir(String input) {

        String tersInput=" ";

        for (int i = input.length()-1; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);
        }
        System.out.println(tersInput);

    }
}
