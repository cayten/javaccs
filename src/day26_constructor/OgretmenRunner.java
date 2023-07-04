package day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen=new Ogretmen();
        ogretmen.isim="canan";
        System.out.println(ogretmen.toString());

        System.out.println("****************************************");

        Ogretmen ogretmen1=new Ogretmen("Canan Ayten","Soylu","01.10.1990","Matematik","IT");
        System.out.println(ogretmen1.toString());

        System.out.println("****************************************");

        Ogretmen ogretmen2=new Ogretmen("Canan Ayten","Soylu","01.10.1990");
        System.out.println(ogretmen2.toString());

        System.out.println("****************************************");
    }












}
