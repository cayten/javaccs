package day30_immutable;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String str1="Ali can";
        String str2=str1+"";
        String str3=new String("Ali Can");
        String hiclik="";
        String str4= str1.concat(hiclik);

        System.out.println(str1==str2); // false
        System.out.println(str1.equals(str2));// true

        System.out.println(str1.equals(str3)); // true
        System.out.println(str1==str3); // false

        System.out.println(str2.equals(str3)); // true
        System.out.println(str2==str3); // false


        /* yeni bir String olustrurken
        1- Esitligin saginda new keyword u olursa java direkt yeni bir obje ve ref oluisturur

        2- Eger esitin saginda bir method calisiyor veya + islemi yap[iliyorsa String Immutable oldugundan degisikligi
        kaydetmek uzere hemen bir kopya objenin icine koyar
         */

        String str5="Ali Can";
        String str6=str1;

        System.out.println(str5.equals(str6));// true
        System.out.println(str1==str6);// true

        /* Eger yeni bir String objesi olusturuken
        new kelimesi kullanilmaz veya esitligin saginda islem olmazsda Java bakar

        Eger daha once olusturulan Strin g objelerden (String havuzu)
        1-1 auni String varsa o objeyi ve referansini kullanir,
        1-1 aynisi yoksa yeni bir obje olusturur.
         */



    }
}
