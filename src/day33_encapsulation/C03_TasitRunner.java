package day33_encapsulation;

public class C03_TasitRunner {

    public static void main(String[] args) {
        C03_Tasit tasit=new C03_Tasit();
        tasit.setTasitTuru("Kamyon");
        tasit.setMuayeneVarmi(true);
        tasit.setYil(2022);
        System.out.println("Aracin Turu : "+tasit.getTasitTuru() +"\nAracin Yili :"+ tasit.getYil()+ "\nAracin muayenesi var mi :"+tasit.isMuayeneVarmi());
    }
}
