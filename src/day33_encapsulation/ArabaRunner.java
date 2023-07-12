package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1=new Araba();
        // arb1 objesi uzerinden marka variable ina
        // ulasabildim, degistirilebildim(set) ve yazdirabildim (get)
        arb1.marka="Volvo";

        System.out.println(arb1.marka);

        // access modifier kullanarak marka variable ina ulasimi
        // tamamen serbest yapabilir veya tamamen engelleyebilirim
        // private yaptigimiz modele ise hic ulasamayiz
        // yani access modifier ya hep ua hic diyor

        //marka yi degistirelim ama goremeyelim
        // yakit i da gorelim ama degistiremeyelim
        // set ve get yatkilerini ozel olarak tanimlamak isterseniz

        // 1. adim - ozel yatki tanimlayacaginiz variable lari privaye yapin
        // private bir dataya baska class lardan ulasmak mumkun olmadigindan

        // 2. adim - set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim

        arb1.setModel("S90"); // model olarak S90 atadik
                              // model i yazdirma imkanimiz yok, cunku getter method u yok

        System.out.println(arb1.getYakit()); // Elektriki bilgisini yazdirabildik
                                             // yakit i degistiremeyiz cunku setter methodu yok
    }
}
