package day15_overloading_foorlop;

public class C01_ReturnMethod {
    public static void main(String[] args) {

        //verilem iki sayiyi carpip
        //sonucu bize donduren bir method yapalim
        int ilkSayi=10;
        int ikinciSayi=5;
        int sonDurum=carpGetir(ilkSayi,ikinciSayi);
        System.out.println(sonDurum);
    }


    public static int carpGetir(int sayi1,int sayi2){
        int sonuc =sayi1*sayi2;

        return sonuc;
    }











    }

