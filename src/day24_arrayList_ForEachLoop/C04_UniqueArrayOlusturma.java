package day24_arrayList_ForEachLoop;

import java.util.*;

public class C04_UniqueArrayOlusturma {
    public static void main(String[] args) {
        // Soru 2) Verilen bir array'deki tekrar eden elementleri tek bir defa barindiran
        // yeni bir array olarak donduren bir method olusturun
        int[] arr = {2, 3, 5, 6, 3, 5, 4, 1, 9, 6, 3, 5, 5};


        System.out.println(Arrays.toString(uniqueArrayOlustur(arr)));

    }

    public static int[] uniqueArrayOlustur(int[] arr) {

        Arrays.sort(arr);

        List<Integer> yeniList = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1] && !yeniList.contains(arr[i])) {
                yeniList.add(arr[i]);
            }

        }


        int[] yeniarr = new int[yeniList.size()];

        for (int i = 0; i < yeniList.size(); i++) {

            yeniarr[i] = yeniList.get(i);

        }
        return yeniarr;
    }
}