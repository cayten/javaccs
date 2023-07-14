package day35_inheritancedaConsuctorKullanimi;

public class C3DizelCorolla extends C2Corolla {
    C3DizelCorolla() {
        System.out.println("CDizelCorolla Parametresiz cons");
    }

    C3DizelCorolla(String isim) {
        super(isim);
        System.out.println("CDizelCorolla Parametreli cons");
    }

    public static void main(String[] args) {
        C3DizelCorolla obj1 = new C3DizelCorolla("isim");
    }
}