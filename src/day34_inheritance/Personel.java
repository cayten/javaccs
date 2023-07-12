package day34_inheritance;

public class Personel {

    int perNo;
    String isim="Isim Belirtilmedi";
    String deparman="Departman Belirtilmedi";

    public  void  maas(){
        System.out.println("Tum personelin maasi");
    }

    public void mesai(){
        System.out.println("Tum personel satatusune gore mesai");
    }

    public void fazlaMesaiUcreti (){
        System.out.println("Personel fazla mesai ucretini statusune gore alir");
    }
}
