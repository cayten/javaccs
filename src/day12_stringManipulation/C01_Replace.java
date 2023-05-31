package day12_stringManipulation;

public class C01_Replace {
    public static void main(String[] args) {

        String str="Bu gun  ha va cok  guz el";

        System.out.println(str.replace(" ",""));

// hava kelimesini java ile degistirelim
        String yeniKelime=str.replace("h","j").replace(" ","");
        System.out.println(yeniKelime);
        // gu zel yerine harika yazalim

        String yepYeniKelime=str.replace("guz el","harika");
        System.out.println(yepYeniKelime);

//Cumleyi replace kullanarak Bugun Java cok guzel yapalim

        String sonKelime=str.replace("Bu gun","Bugun").replace("ha va","java")
                .replace("guz el","guzel");
        System.out.println(sonKelime);












    }
}
