package day20_arrays;

import java.util.Arrays;

public class C05_SolaKaydirm {
    public class C05_SolaKaydirma {
        public static void main(String[] args) {


            //Soru 1: Verilen 3 elemanli bir array'in
            // tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
            // Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.


            int arr[] = {1, 2, 3, 4, 5};

            int temp = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }


            arr[arr.length - 1] = temp;
            System.out.println(Arrays.toString(arr));

//yukarida degistirdigimiz array i
            //ilk durumuna getirmek icin saga kaydiralim

            temp = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];

            }


            arr[0] = temp;
            System.out.println(Arrays.toString(arr));

        }
    }
}