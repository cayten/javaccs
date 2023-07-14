package day36_inheritanceDataTypeKullanimi;

public class APersonel {

    protected String isim=" Isim Belirtilmedi";

    protected String soyisim=" SoyIsim Belirtilmedi";
    protected String departman=" Departman Belirtilmedi";

    protected void maas(){
        System.out.println("Tum personelimiz maas alir");
    }

    protected void sigorta(){
        System.out.println("Tum personelimize sigorta yapilir");
    }
}
