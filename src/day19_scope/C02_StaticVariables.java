package day19_scope;

public class C02_StaticVariables {
    static int staticSayi=10;
    String isim="Mehmet";
    static int degersizStaticVar;
    int degersizInstanceVariable;
    /*
    Class level daki variable lara deger atamasak da java kabul ediyor


     */



    public static void main(String[] args) {
        /*
        bir variable static olusturulduysa
        objeler icin degil class icin gecerlidir
         */
        System.out.println(staticSayi);//10
        staticMethod();
        staticSayi=12;
        System.out.println(staticSayi);//12
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println(staticSayi);//20
/*
instance bir variable in degerini bulmak icin objenin olusturulmasindan itibaren
istenen satira kadar kodu takip etmeliyiz

Static variable da ise class in en basindan baslayarak
istenen satira kadar kodu takip edip
static variable'in son degerini bulmamiz gerekir

 */



    }


    public static void staticMethod(){
        System.out.println(staticSayi);//10
    }
    public void staticOlmayanMethod(){

        /*
        static variable lar class icerisinden her yerden ulasilabilir
        static olsun veya olmasin tüm methodlar static variablelari gorebilir
        ve degistirebilirler
        farkli methodlarda static variable nin hangi degeri alacagini bilmelistiyorsak class ın basindan itibaren kodun calismasini takip etmeliyiz
        method ne zaman cagirilirsa o anki static variable degerini method da kullanabiliriz
         */
        System.out.println(staticSayi);//12
        staticSayi=20;
    }
}
