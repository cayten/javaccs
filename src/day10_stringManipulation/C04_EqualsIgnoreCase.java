package day10_stringManipulation;

public class C04_EqualsIgnoreCase {
    public static void main(String[] args) {


        String str="Canan Ayten";
        String str1="CANAN Ayten";
        String str2="Canan ayten";
        String str3="Canan Ayten_";

        System.out.println(str.equals(str2));//false
        System.out.println(str.equalsIgnoreCase(str2));//true

        System.out.println(str1.equals(str3));//false
        System.out.println(str1.equalsIgnoreCase(str3));//false

        System.out.println(str.equals(str1));//false
        System.out.println(str.equalsIgnoreCase(str1));



    }
}
