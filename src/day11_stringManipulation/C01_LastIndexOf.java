package day11_stringManipulation;

public class C01_LastIndexOf {
    public static void main(String[] args) {
        /* verilen kelime icin asagıda ki sartlardan uygun olani yazan bir program yaziniz
-verilen kelime cumlede kullanilmamis
-verilen kelime cumlede sadece 1 kere kullanilmis
-verilen kelime cumlede birden fazla kullanilmis

  */
        String cumle="Java cok kolay',cok kolay guzel";
        String kelime= "Java";

        int kelimeIndexOf= cumle.indexOf(kelime);
        int kelimeSonIndexOf=cumle.lastIndexOf(kelime);
        System.out.println(kelimeIndexOf);
        System.out.println(kelimeSonIndexOf);

        if (kelimeIndexOf==-1){
            System.out.println("verilen kelime cumlede kullanilmamistir");
        } else if (kelimeIndexOf==kelimeSonIndexOf) {
            System.out.println("verilen kelime cumlede 1 defa kullanilmistir");

        }else {
            System.out.println("verilen kelime cumlede 1 den fazla kullanilmistir");
        }


    }
}
