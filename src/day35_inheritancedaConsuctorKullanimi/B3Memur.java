package day35_inheritancedaConsuctorKullanimi;

public class B3Memur extends B2Muhasebe{
    /*
      Extends keyword kullanilan classlarda
      ister default consructor bulunsun
      istersek de biz yeni constructor(lar) olusturalim
      Java constructor'in ilk satirina
      super(); constructor call yazar
      super(); constructor call, default constructor'a benzer
      gorunmese de orada vardir ve calisir
      ancak biz ilk satira farkli bir constructor call yazarsak
      Java super(); 'i siler
      Eger biz mudahale edip kendi constructor call'umuzu olusturmazsak
      Javanin default olarak olusturdugu constructor call
      her zaman parametresizdir
      super();
     */
    B3Memur(){
        System.out.println("Memur parametresiz cons");
    }
    B3Memur(String isim){
        System.out.println("Memur parametreli cons");
    }
    public static void main(String[] args) {
        B3Memur memur=new B3Memur();
        B3Memur memur1=new B3Memur("Canan");
    }
}