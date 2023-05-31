package day10_stringManipulation;

public class C03_Equals {
    public static void main(String[] args) {

        String str="Canan Ayten";
        String str1="CANAN Ayten";
        String str2="Canan Ayten" + "";
        String str3="Canan Ayten";
        String str4=new String("Canan Ayten");

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println(str==str1); //false
        System.out.println(str==str2); //true
        System.out.println(str.equals(str2)); //true
        System.out.println(str==str4); //false
        System.out.println(str.equals(str4)); //true
        System.out.println(str2.equals(str4)); //true
        System.out.println(str2==str4); //false

/*
        String lerde ayni String olsa bile == her zaman calismaz
        emin olmakisterseniz equal() kullanmalisiniz

        equals () kullandiginizda dikkat edecegimiz TEK SEY metinlerin bire-bir ayni olmasidir

         */














    }
}
