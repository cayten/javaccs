package practive_08;

public class C02_Odev {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

        int sayi[][]={{1,3,6},{2,8},{5,7,9,14}};

        int toplam= sayi[0][0];
        for (int i = 0; i < sayi.length; i++) {

            for (int j = 0; j < sayi[i].length; j++) {

                if (sayi[i][j]%2==0){

                }

            }

        }
        System.out.println(toplam);
    }
}
