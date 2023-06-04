package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir array'in boyutunu ve tum elementlerini alarak bir
        // array olusturup, bu array'i bize donduren bir method olusturun






        System.out.println(Arrays.toString(arrayOlustur()));


    }

    public static int[] arrayOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kac elemanli array listesi olusturmak istersiniz");
        int uzunluk=scan.nextInt();

        int [] arraylist=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println(i+". index icin sayi giriniz");
            arraylist[i]=scan.nextInt();
        }


        return arraylist;
    }
}
