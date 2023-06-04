package day21_arrays;

import java.util.Arrays;

public class C06_ArrayElementEkleme {
    public static void main(String[] args) {
        //C05 deki methodu kullanarak array e eleman ekleyelim

        String[] takimListesi={"canan","cuneyt","mihrumah katre"};
        String yenieklenen="oglan";
        takimListesi=C05_ArrayElementEkleme.elemanEkle(takimListesi,yenieklenen);
        System.out.println(Arrays.toString(takimListesi));
    }
}
