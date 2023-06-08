package practice_03;

public class C05_Odev {
    /*
     * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
     * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
     */
    public static void main(String[] args) {
        int sayi1[][] = {{0, 2, -1}, {3, 8, 9}, {7}};


        int toplam = 0;

        for (int i = 0; i < sayi1.length; i++) {
            for (int j = 0; j < sayi1[i].length; j++) {
                toplam += sayi1[i][j];

            }

        }
        System.out.println(toplam);


        int sayi2[][] = {{-7, 6, -9}, {0, 12}, {19}};
        int yeniToplam=0;

        for (int i = 0; i < sayi1.length; i++) {
            for (int j = 0; j < sayi2[i].length; j++) {
                yeniToplam += sayi2[i][j];

            }

        }
        System.out.println(yeniToplam);
    }
}