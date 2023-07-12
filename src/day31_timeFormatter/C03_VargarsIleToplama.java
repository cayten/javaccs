package day31_timeFormatter;

public class C03_VargarsIleToplama {



    public static void main(String[] args) {
        // verilen kac int olursa olsun hepsini toplayip sonucu yazdiran bir method olusturun
        toplaYazdir(2,3);
        toplaYazdir(3,4,5);
        toplaYazdir(3,4,5,6);
        toplaYazdir(3,4,5,6,7);
        toplaYazdir(3,4,5,6,7,8);
    }
    public  static void toplaYazdir(int... sayi){
    /*
    int... sayi   bu gosterim integer variable'lardan olusan bir varargs demektir.
    varargs array alt yapisini kullanir
     */
        int toplam=0;
        int sayiUzunlugu= sayi.length;
        for (int i:sayi) {
            toplam+=i;
        }
   /* for (int i = 1; i <sayiUzunlugu ; i++) {
            toplam=+i;
    }
    */
        System.out.println("Verilen "+sayiUzunlugu + " adet sayinin toplami = "+toplam);
    }
}
