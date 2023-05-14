package day13_MethodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {

// input olarak verilen iki integer i toplayip sonucunu yazdiran
        // bir method oluşturun

        int sayi1=10;
        int sayi2=20;
        // method 4 adımda olusturulur
        //1.adim method call
        //2.adim argumant eklenmesi gerekeiyorsa ekleyelim
        //eger methodun return type ı void den farklı olacaksa
        //bir variable olusturup method call u assign edelim
        topla(sayi1,sayi2);

    }

    public static  void topla(int sayi1,int sayi2){
//3.adim method deklarasyonunda degismesi ge                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               reken
        //bolumleri degistir(access modifier,return type vb.                                                                                                                                         .)
        //4. eger return type void disinda bir sey ise
        // return keyword u ve donecek degeri hesaplamaliyiz


        System.out.println("girilen iki sayinin toplami :"+(sayi1+sayi2));


    }





    }

