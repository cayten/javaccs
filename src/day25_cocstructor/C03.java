package day25_cocstructor;

public class C03 {

    /* Proje olustururken bazi class lar run etmek icin degiol variable ve method olsturup
    bunlari baska class lardan kullanmak icin olusturur
     */

    /* Default constructor, parametsizdir. goremezsek bile
    ihtiyac oldugunda calisir.

    Class icinde parametreli veya parametresiz herhangi bir constructor olusturursak
    java defoult constructor i siler
     */

    C03(){

    }
    /* Olusturdugumuz parametresiz bu constructor
    default constructor ile 1-1 aynidir
     */

    String isim= "Etka";
    public void method01(){
        System.out.println("C03 method calisti");
    }
}
