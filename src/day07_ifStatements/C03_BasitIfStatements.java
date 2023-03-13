package day07_ifStatements;

public class C03_BasitIfStatements {

    public static void main(String[] args) {
        /*
        Bir if statement'da { kullanilmazsa
        Java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur

        eger birden fazla satir ayni If sartina baglanmis ise mutlaka '{' kullanmalıyız
         */


        int a = -15;
        if (a > 0)
            System.out.println("a sayisi sifirdan buyuktur");
            System.out.println("a sayisi sifirdan kucuktur");
            System.out.println("a sayisi sifira esittir");


        if (a % 2 ==0)
            System.out.println("sayi 2 ye bolunur");
        System.out.println("java akisa devam eder");
        System.out.println("Bundan sonrası her turlu yazilir");
    }
}
