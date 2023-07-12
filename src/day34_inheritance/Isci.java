package day34_inheritance;

public class Isci extends Personel {

    /* Normal hayatimizda parent
    cocuk sahibi olmaya karar verebilir
    Java da ise child class lar ozelliklerini inherit etmek istedikleri
    class i kendilerine parent edinirler

    mesela isci class ini oluisturunca nelere ihtiyaci var diye dusunsek
    Personel class indaki tum variable ve method lara ihtiyaci oldugunu gorebiliriz.

    Bu durumda yeniden o variable ve methodlari olusturmak yerine
    Personel class ini kendimize parent ediniriz

    Bir class i parent edinmek icin extends keyword kullanmaliyiz

     */

    int persNo=1001;

    public static void main(String[] args) {

        Isci isci1=new Isci();
        System.out.println(isci1.isim); // isim belirtilmedi
        // Kendi class imizda isim variable i y, onun icin parent a gideriz
        isci1.isim="Cuneyt";

        System.out.println(isci1.persNo);// 1001 kendi class imizda varsaonu kullaniriz

        isci1.maas();// isciler min 15 euro saat ucret alir


    }public void maas(){
        System.out.println("isciler min 15 euro saat ucret alir");
    }
}
