package day24_arrayList_ForEachLoop;

import java.util.*;


public class C02_ArraydanListOlusturma {
    public static void main(String[] args) {

    /*
    icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
    kullanicidan bir sayi isteyip
    listede var olup olmadigini kullaniciya yazalim
     */
        Random rastgele = new Random();
        int sayi = 0;
        List<Integer> sayiListesi = new ArrayList<>();

        while (sayiListesi.size() <= 200) {


            sayi = rastgele.nextInt(1000);

            if (!sayiListesi.contains(sayi)) {
                sayiListesi.add(sayi);
            }

        }

        System.out.println(sayiListesi);


        Scanner scan = new Scanner(System.in);


        int sayac = 1;
        int limit = 3;
        while (limit >= 0) {
            if (limit==0){
                System.out.println("Tahmin hakkiniz doldugu icin oyun bitti");
                break;
            }else{
                System.out.println("Lutfen bir sayi giriniz");
                sayi=scan.nextInt();

                if (sayiListesi.contains(sayi)){
                    System.out.println("Tebrikler "+sayac+" adet denemede listedeki sayiyi buldunuz");
                    break;
                }
                sayac++;
                limit--;
            }

        }

    }








}
