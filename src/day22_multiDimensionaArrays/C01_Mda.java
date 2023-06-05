package day22_multiDimensionaArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {

        int [][]sayilar={{1,2,3},{4,5}};


        System.out.println(sayilar[0]);//[I@48140564
        System.out.println(Arrays.toString(sayilar[0]));//[1, 2, 3]
        System.out.println(sayilar[0][0]);//1
        System.out.println(sayilar[1][1]);//5

        System.out.println(Arrays.toString(sayilar));//[[I@48140564, [I@58ceff1]
        System.out.println(Arrays.deepToString(sayilar));//[[1,2,3],[4,5]]
        int [][]sayilar1=new int[2][4];
        sayilar1[0][0]=1;
        System.out.println(Arrays.deepToString(sayilar1));
        //{{1,2,3,4},{1,2,3,4}}

    }
}
