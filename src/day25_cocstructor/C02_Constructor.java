package day25_cocstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {

              C01              obj1    =     new           C01();
        // class adi       objenin adi     keyword      contructor

        Scanner scan= new Scanner(System.in);
        Random rnd = new Random();
        List <String> list=new ArrayList<>();
        //List <String> list2 = new List<>();
        /*
        Javada bir obje olusturabilmek
        icin mutlaka constructor kullanilmalidir
         */


        System.out.println(obj1.sayi);// 0 default deger
        obj1.deneme();//C01 den deneme methodu calisir
    }
}
