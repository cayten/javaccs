package day25_cocstructor;

public class Car {
    /* bu class bizim kaliphanemiz
    bir araba olusturmak icin htiyacimiz olan variable ve method lari bu class larda belirleriz

    sonra farkli class larda araba olusturmamiz gerekirse bu class dan bir obje olusturup burada burada
    belirlenen varibale ve method lara gore araba uretir
     */

    String marka=" Marka belirtilmedi";
    String model=" Model belirtilmedi";
    int yil;
    int fiyat;

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba max " + hiz+ " km hiz yapar");
    }
   public Car(){

    }
}
