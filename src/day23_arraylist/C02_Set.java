package day23_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C02_Set {
    public static void main(String[] args) {
    /*
      elimizde urunlerin bulundugu bir liste var
      urun listesindeki istenen siradaki urunu
      istegimiz yeni urunle degistirip
       eski urunu, varolan eski urunler listesine ekleyelim
     */

        List<String> urunler=new ArrayList<>();

        urunler.add("nutella");
        urunler.add("2 tane bounty");
        urunler.add("1 tane sinikirs");
        urunler.add("1 tane boskot farawla");
        urunler.add("1 tane doritos cubun");
        urunler.add("tenkyu");

        List<String>eskiUrunler=new ArrayList<>();
        String yeniUrun="tutku";
        String silinecekUrun="nutella";
        int temp=urunler.indexOf(silinecekUrun);
        String silinenUrun=urunler.set(temp,yeniUrun);
        eskiUrunler.add(silinenUrun);
        System.out.println("urunler listesi = " + urunler);
        System.out.println("eskiUrunler listesi = " + eskiUrunler);

        yeniUrun="nero";
        silinecekUrun="tenkyu";
        temp=urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp,yeniUrun);
        eskiUrunler.add(silinenUrun);
        System.out.println("urunler listesi = " + urunler);
        System.out.println("eskiUrunler listesi = " + eskiUrunler);

    }







}
