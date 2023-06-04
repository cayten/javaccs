package day21_arrays;

import java.util.Arrays;

public class C07_Sort {

    public static void main(String[] args) {

        int[] sayilar={5,7,1,6,4,5,3,9};
        System.out.println(Arrays.toString(sayilar));
        //Array  i Arrays class ini kullanarak  natural sirali hale getirebiliriz

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

    }
}
