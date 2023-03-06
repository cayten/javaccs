package day05_matematikselIslemler;

public class C02_Post_Pre_Increment {
    public static void main(String[] args) {
        int sayi=10;
        System.out.println("pre-increment : " + ++sayi); //11
        System.out.println("post-increment : " + sayi++);//11
        System.out.println("post-increment den sonra : " + sayi);//12
    }
}
