package day36_inheritanceDataTypeKullanimi;

public class CMemur extends BMuhasebe{

    int saatUcreti=12;

    int gunlukMesai=9;


    protected void maas() {
        System.out.println("Memurlar: "+(30*saatUcreti*gunlukMesai));
    }

    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        CMemur mmr1 =new CMemur();
        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcreti);//12

        mmr1.maas();
        mmr1.ozelSigorta();
        mmr1.sigorta();

        System.out.println(mmr1.isim);//personel
        System.out.println(mmr1.soyisim);//personel
        System.out.println(mmr1.departman);//personel



        BMuhasebe mhsb1=new BMuhasebe();
        /* her ne kadar Memur Class inin icinde olsam da olusturdugum obje
        Muhasebe class indan cunku data turu ve contructor BMuhasebe

        String str="Cuneyt;
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;

        BMuhasebe class i da obje olusturulabilen bir class dir yeni
        data turudur
         */

        System.out.println(mhsb1.gunluMesai);//8 muhasebe
        System.out.println(mhsb1.saatUcreti);//10 muhasebe

        mhsb1.maas();// muhasebe Personel Minimum:  2400maas alir
        mhsb1.ozelSigorta();// muhasebe Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        mhsb1.sigorta();// muhasebe Tum personelimize sigorta yapilir

        System.out.println(mhsb1.isim);// personel
        System.out.println(mhsb1.soyisim);// personel
        System.out.println(mhsb1.departman);// personel







    }
}
