package practice_07;

import java.util.Arrays;

public class C01_Odev {
    /*
given an int array and find the squares of the elements
(Verilen bir int dizisi icin elemanlarin karelerini bulun )
Example:{2,6,4,5,8,9}
output:{4,36,16,25,64,81}
*/


    public static void main(String[] args) {
        int sayilar []={2,6,4,5,8,9};
        for (int i = 0; i < sayilar.length ; i++) {
            sayilar[i]*=sayilar[i];

        }
        System.out.println(Arrays.toString(sayilar));
    }
}
