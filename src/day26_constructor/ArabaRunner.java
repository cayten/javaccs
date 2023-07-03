package day26_constructor;

public class ArabaRunner {


    public static void main(String[] args) {




        Araba araba=new Araba();

        araba.fiyat=15000;
        araba.marka="Audi";
        araba.model="A8";
        araba.yil=2022;
        System.out.println("Araba bilgileri\nMarka : " + araba.marka +"\nModel : " + araba.model
                +"\nYil : " + araba.yil+ "\nFiyat : " + araba.fiyat);




        Araba araba1=new Araba("BMW","i8",2023,3000);
        System.out.println("Araba1 bilgileri\nMarka : " + araba1.marka +"\nModel : " + araba1.model
                +"\nYil : " + araba1.yil+ "\nFiyat : " + araba1.fiyat);

        Araba araba2=new Araba("Porsche","Caymann",2023,30000);
        System.out.println("Araba2 bilgileri\nMarka : " + araba2.marka +"\nModel : " + araba2.model
                +"\nYil : " + araba2.yil+ "\nFiyat : " + araba2.fiyat);

    }
}
