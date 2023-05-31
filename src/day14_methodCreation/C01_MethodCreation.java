package day14_methodCreation;

import day13_MethodCreation.C02_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        C02_MethodCreation.topla(4,44);
        terstenYazdir("okan");
        //input olarak verilen bir stringi
        // tersten yazdiran bir method olusturalim
    }


    public static void terstenYazdir(String input){

        String tersInput=input.substring(3)+input.substring(2,3)+input.substring(1,2)+input.substring(0,1);
        System.out.println("Verilen kelimenin tersten okunusu :"+tersInput);
    }


}

