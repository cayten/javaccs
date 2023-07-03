package day25_cocstructor;

public class C01 {

    /* Java OOP konsep kullanildigi icin
    olusturulan her bir calss in ihtiyac duydugunda obje uretebilmesine
    uygun dizayn etmistir.

    Ama her class dan obje uretilmeyebilir.

    Bunun icin Java ihtiyac halinde kullanilmasi icin her class da default bir constructor koymustur. Bu
    default constructor calss dan obje olusturuldugunda otomatic calisir.

    Ornegin bu class da constructor gorunmesine ragmen C02 class inda icinde
     oldugumuz C01 class indan bir obje uretebildik

     */
int sayi;
public  void  deneme (){
    System.out.println("C01 den deneme methodu calisir");
}
}
