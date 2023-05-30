package day12_stringManipulation;

public class C02_ReplaceAll {
    public static void main(String[] args) {


       /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space
    \\S   ==> space disindaki hersey  */


        String str="1Bu2gu3n Ja*va- cok g3uz/el";

// str i Bugun Java cok guzel haline getirin
        //replaceAll() deki all un amaci ayni ozellikteki tum karakterleri kapsamasidir
        str=str.replace(" ","qazwsx");



//butun sayilari sil
        str=str.replaceAll("\\d","");
//butun ozel karakterleri sil
        //tum ozel karakterleri silelim dedigimizde space ler siliniyor
        //space leri korumak icin en basta onlarin yerine cumlede bulunmayacak
        //bir string koyalim
        // "qazwsx"
        str=str.replaceAll("\\W","");
        str=str.replace("qazwsx"," ");
        System.out.println(str);




    }
}
