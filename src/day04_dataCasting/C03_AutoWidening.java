package day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {

        //dar veri turundeki bir degeri genis veri turundeki variable a otomatik olarak assign eder
        // boolean, char, byte, short, int, long, float and double

        byte sayi1=23;
        short sayi2=55;
        int sayi3= sayi1+sayi2;
        System.out.println(sayi3);

        double sayi4= sayi1*sayi2;
        sayi4=(double) sayi2/sayi1;
        System.out.println(sayi4);







    }
}
