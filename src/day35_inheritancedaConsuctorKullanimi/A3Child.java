package day35_inheritancedaConsuctorKullanimi;

public class A3Child {
    /*    A1GrandParent grandParent=new A1GrandParent();
           System.out.println(grandParent.isim);
   // bu objeyi olusturmak icin Crandpa Cons. calisir
           // parent veya child const calismaz
        */
    A2Parent parent=new A2Parent();

    A3Child child=new A3Child();

          /*
        Java'da bir class'i kullanabilmek icin
        o class'dan obje olusturur, dolayisiyla
        o class'in constructor'ini kullanirdik
        Java inheritance'da parent class'lardaki
        ozellikleri kullanabilmek icin
        o class'larin constructor'larini
        otomatik calistiran bir yapi kurmustur
        Ornegin biz child class'inda
        Child class'indan bir obje olusturmak istedigimizde
        Child constructor'ini kullaniriz
        Java Child(){} gordugunde
        once parent'in constructor'ini calistirmam lazim der
        buradan Parent cons'a gider
        Parent class'inda Parent(){} gorunce
        once bunun parent'inin yani GrandParent cons.
        calismasi gerekir der
        Boylece extends keyword olmayan class'a kadar gider
        ve oradan baslayarak tum constructor'lari
        asagi dogru calistirir
         */
}








