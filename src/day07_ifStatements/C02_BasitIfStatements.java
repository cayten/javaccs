package day07_ifStatements;

public class C02_BasitIfStatements {

    public static void main(String[] args) {

        /*
basit if cumleleri kodun diger parcalarindan bagimsizdir
sadece bir sart kontrol eder, sart saglaniyorsa, if body calisir, yoksa calismaz
birden fazla basit if cumlesi varsa girilen sarta bagli olarak,
tumunde if body'si calisabilir, kismen if body'leri calisabilir
veya hicbir if body'si calismayabilir
 */

        int a = 20;
        if (a > 10) {

            System.out.println("sayimiz ondan buyuktur");
        }

        if (a < 10) {

            System.out.println("sayimiz ondan kucuktur");
        }

        if (a == 10) {

            System.out.println("sayimiz ondan esittir");
        }
    }
}
