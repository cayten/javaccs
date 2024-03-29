package day21_arrays;

public class C02_EnUzunVeEnKisaKelimeBulma {
    public static void main(String[] args) {
        // Soru 2- Verilen String bir array'de
        // en uzun ve en kisa String'leri yazdiran bir method olusturun

        String sinifListesi[] = {"Canan", "Ayten", "cuneyt", "ibrahim", "ayse"};
        enUzunVeKisaKelime(sinifListesi);

    }

    private static void enUzunVeKisaKelime(String[] isimler) {

        String enUzunKelime = isimler[0];
        String enKisaKelime = isimler[0];
        for (int i = 1; i < isimler.length; i++) {
            if (isimler[i].length() > enUzunKelime.length()) {
                enUzunKelime = isimler[i];
            }
            if (isimler[i].length() < enKisaKelime.length()) {
                enKisaKelime = isimler[i];
            }
        }
        System.out.println("Array listesindeki en uzun kelime " + enUzunKelime);
        System.out.println("Array listesindeki en kisa kelime " + enKisaKelime);
    }
}