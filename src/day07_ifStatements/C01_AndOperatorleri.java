package day07_ifStatements;

public class C01_AndOperatorleri {
    public static void main(String[] args) {


        /*
        Java and operatoru konusunda bize iki secenek sunar
        && kullanirsak, ilk false buldugunda, artik sonucun false olacagini bilir
        ve geriye kalan sartlari incelemez
        & kullanirsak tum sartlari kontrol eder sonra sonucu belirler
        bu calisma usulunden dolayi & operatoru, && operatorune gore daha yavas olabilir.
         */


        int a = 10;
        int b = 15;
        int c = 25;

        System.out.println(a > 0 & b < 10 & c > 30);
        System.out.println(a > 0 && b < 10 && c > 30);


    }
}
