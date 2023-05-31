package day14_methodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {
        String isim="enes";

        String soyIsim="Bozkurt";

/*String gizliIsim=isimGizle(isim,soyIsim);
        System.out.println(gizliIsim);*/
        isimGizle(isim, soyIsim);
    }


    public static String isimGizle(String isim ,String soyIsim){

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");
        System.out.println(isim+" "+soyIsim);

        return isim+" "+soyIsim;

    }
}
