package day35_inheritancedaConsuctorKullanimi;

public class A1GrandParent {
    protected String isim="Grandpa ismi belirtilmedi";
    /*
     Her class'da gorunmese bile bir constructor vardir
     Bu class'dan obje olusturmak istedigimizde
     default constructor devreye girecektir.
     Default constructor'i gozlemleyemeyecegimiz icin
     onun yerine kullanilabilecek parametresiz constructor olusturalim
    */
    protected String misim="Grandpa ismi belirtilmedi";
    protected String grandpaklupAdi="Grandpa Klubu";
    public A1GrandParent(){
        System.out.println("Grand Parent Constructor calisir");
    }
}
