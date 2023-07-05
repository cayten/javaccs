package practice_05;

import java.util.Scanner;

public class P07_Converting {
    public static void main(String[] args) {
        /*
   galonu litreye ceviren bir java programi yaziniz
       1 gallon = 3.785 litre
   litreyi galona ceviren bir java programi yaziniz
       1 litre = 1/3.785 gallon

   // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
   // formül
   // c = (f-32)*5/9
*/

        /*double gallon=1000;
        double litre=gallon*3.785;
        String sonuc=gallon+"litre olarak" + litre+"esittir";
        System.out.println(sonuc);*/

        int litre=1000;
        double gallon= litre/3.785;
        String sonuc= litre+ " gallon olarak"+ gallon +"esittir";


        System.out.println(sonuc);


        Scanner scan= new Scanner(System.in);

        System.out.println("bir fahrenayt degeri giriniz: ");
        int fahrnyt=scan.nextInt();
        System.out.println("girdiginiz deger: " + fahrnyt+ " " + "derece olarak: " + (fahrnyt-32)*5/9);


    }
}
