package day31_timeFormatter;

public class C04_VarargsileEnUzunKelimeyiBulma {

    public static void main(String[] args) {
        enUzunKelime("Canan Ayten","cuneyt","ayse","hande","ibrahim vecdi");
    }
    public static void enUzunKelime(String... kelime){
        String enUzunKelime=kelime[0];
        for (String i:kelime) {
            if (i.length()>enUzunKelime.length()){
                enUzunKelime=i;
            }
        }
        System.out.println("Girilen kelimelerin en uzunu :"+ enUzunKelime);
    }
}
