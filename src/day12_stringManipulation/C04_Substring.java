package day12_stringManipulation;

public class C04_Substring {
    public static void main(String[] args) {
        String str ="Java cok yasa";


        System.out.println(str.substring(1,2));//a

        System.out.println(str.substring(5,8));//cok

        System.out.println(str.substring(7,5));//StringIndexOutOfBoundsException
    }
}
