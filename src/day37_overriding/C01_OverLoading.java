package day37_overriding;

public class C01_OverLoading {
    public static void main(String[] args) {

    }
    /*
        Bir class'ta ayni isimde ve ayni signature'a sahip iki method olmaz
        Ayni class'ta ayni isimde birden fazla method olusturmak istersek
        mutlaka signature'i degistirmeliyiz
        Farkli class'larda ayni isim ve signature'a sahip iki method olabilir mi?
         */
    void ekleme(){}
    void ekleme(int sayi){}
    void ekleme(String sayi){}
    void ekleme(String str,int sayi){}
    void ekleme(int sayi,String str){}
}





