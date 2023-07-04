package day26_constructor;

public class KamyonRunner {
    public static void main(String[] args) {

        Kamyon kamyon=new Kamyon();

        System.out.println("Kamyonumuzun ozellikleri"+kamyon.toString());

        System.out.println("****************************************************");

        Kamyon kamyon1=new Kamyon("Scania","lord");
        System.out.println("1.Kamyonumuzun ozellikleri"+kamyon1.toString());

        System.out.println("****************************************************");

        Kamyon kamyon2=new Kamyon("Ford","Horse",2023,15000);
        System.out.println("2.Kamyonumuzun ozellikleri"+kamyon2.toString());

    }
}
