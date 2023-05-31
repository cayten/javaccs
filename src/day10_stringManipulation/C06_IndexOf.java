package day10_stringManipulation;

public class C06_IndexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";
        System.out.println(str.indexOf("g"));//6
        System.out.println(str.indexOf('a'));//1
        System.out.println(str.indexOf("av"));//1
        System.out.println(str.indexOf("d"));//-1

        String str5="guencakgfokvnhrktsşehjudjhansvbrcxgdmgkfjnxhdvcımvbçxvc";

             //str5 de s harfi kullanilmis mi


        if (str5.indexOf("s")==-1){
            System.out.println("istenilen harf kullanilmamistir");
        }else System.out.println("istenilen harf kullanilmistir");





    }
}
