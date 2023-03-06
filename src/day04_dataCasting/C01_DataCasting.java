package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        /* bazen bir variable a olusturuldugu data turu dısından data turu atanabilir
          bunlardan bazısini java otomatik olarak kabul eder

           Java eger bu deger atamasinda sorun olusacagini
            (data kayiplarin olabilecegi veya adatanin baskalasabilecegi) gorurse
           bu durumda otomatik olarak bu atamayi kabul etmez
           sizden eger bu atamayi istiyorsaniz sorumluluğu almanizi bekler
              */
        double sayi1 = 10.5;
        double sayi2 = 20.5;

        int sonuc = (int) (sayi1 * sayi2);
        System.out.println(sonuc);


        char harf= 'a';
        System.out.println(harf);

        char yeniHarf= (char)(harf+1);
        System.out.println(yeniHarf);

        char yeniHarf2= (char)(harf+2);
        System.out.println(yeniHarf2);
    }
}
