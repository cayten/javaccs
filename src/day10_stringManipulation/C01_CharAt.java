package day10_stringManipulation;

public class C01_CharAt {
    public static void main(String[] args) {
       String str="java ogrenmek ne guzel";
       //ilk harfi yazdirir
        System.out.println(str.charAt(0));
        // m harfi yazdiri
        System.out.println(str.charAt(10));

        System.out.println(str.charAt(22));//StringIndexOutOfBoundsException

        //charAt() kullandigimizda sonuc char olacagi icin artik manipulation yapamayiz
        //String method larindan kullanmamiz gereken bir method varsa
        // charAt den önce kullanmaliyiz








    }
}
