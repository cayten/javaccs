package day36_inheritanceDataTypeKullanimi;

public class DIsci extends BMuhasebe {

    protected int saatUcreti=11;
    protected int gunlukMesai=7;

    protected void maasIsci(){

        System.out.println("Iscile: "+(30*saatUcreti*gunluMesai));

    }

    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe sc1=new BMuhasebe();

        /* BIr obje olusturulurken Data turu
        ve constructor ayni class dan ise direkt o class a gidiyorduk

        Eger data turu ve cons. farkli ise oncelikle
        data turunun oldugu class agideriz.
         */

        System.out.println(sc1.gunluMesai);//
        System.out.println(sc1.saatUcreti);//

        sc1.maas();//
        sc1.ozelSigorta();//
        sc1.sigorta();//

        System.out.println(sc1.isim);//
        System.out.println(sc1.soyisim);//
        System.out.println(sc1.departman);//
    }
}
