package day22_multiDimensionaArrays;

import java.util.Arrays;

public class C04_MdaIstenenArrayiOlusturma {
    public static void main(String[] args) {

        /*
 Asagidaki multi dimensional array'in ic array'lerindeki tum elemanlarin
 toplamini  birer birer bulan ve herbir sonucu yeni bir array'in
  elemani yapan ve yeni array'i  ekrana  yazdiran bir program yaziniz

 Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
 */

        int input [][]  ={ {1,2,3}, {4,5}, {6,7} };
        int toplam=0;
        int [] sonucArray=new int[input.length];
        for (int i = 0; i <input.length ; i++) {
            for (int j = 0; j <input[i].length ; j++) {

                toplam +=input[i][j];

            }
            sonucArray[i]+=toplam;
            toplam=0;
        }

        System.out.println("istenen yeni array = "+ Arrays.toString(sonucArray) );



    }
}
