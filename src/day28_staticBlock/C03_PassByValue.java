package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {

    /*
    %25 indirimli fiyati hesaplayip bize donduren bir method olusturun
     */

        double satisFiyati=100;
        double indirimOrani=25;

        double indirimliFiyat=indirimliFiyatHesapla(satisFiyati,indirimOrani);

        System.out.println("indirimliFiyat = " + indirimliFiyat);
        System.out.println("indirimliFiyat = " + indirimliFiyat);
        System.out.println("indirimliFiyat = " + indirimliFiyat);
        System.out.println("indirimliFiyat = " + indirimliFiyat);

    }

    public static double indirimliFiyatHesapla(double satisFiyati, double indirimOrani) {
        double indirimliFİyat=satisFiyati*(1-indirimOrani/100);
        return indirimliFİyat;
    }
}
