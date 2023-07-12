package day31_timeFormatter;

public class C05_VarargsIleIntString {
    public static void main(String[] args) {
/*
        Varargs teorik olarak sonsuz sayida element alabilir
        bir method'da parametre olarak varargs varsa
        varargs'in sinirlarini bilebilmesi icin parametrelerin sonuncusu olmalidir.
        oncesinde farkli parametreler olabilir ama
        varargs'tan sonra parametre OLAMAZ..
        Bu kuraldan oturu bir method'da sadece BIR tane varargs olabilir
         */
        enUzunKelime(2,"Ali","Veli");
    }
    public static void enUzunKelime(int sayi, String... kelime) {
        String enUzunKelime = kelime[0];
        for (String i : kelime) {
            if (i.length() > enUzunKelime.length()) {
                enUzunKelime = i;
            }
        }
        System.out.println("Girilen kelimelerin en uzunu :" + enUzunKelime);
    }
}
