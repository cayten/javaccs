package day36_inheritanceDataTypeKullanimi;

public class BMuhasebe extends APersonel {
    protected int saatUcreti=10;
    protected int gunluMesai=8;

    protected void maas(){

        System.out.println("Personel Minimum:  "+(30*gunluMesai*saatUcreti)+"maas alir");
    }
    protected void ozelSigorta(){

        System.out.println("Isteyen calisanlara %50 indirimli ozel sigorta yapilir");
    }

}
