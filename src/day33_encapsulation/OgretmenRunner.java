package day33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogrt1= new Ogretmen();

        ogrt1.setIsim("Cuneyt");
        System.out.println(ogrt1.getIsim());

        /* Bu ypntemde data hiding degil daha anlasilir
        bir kod amaclanmis olur
         */


    }
}
