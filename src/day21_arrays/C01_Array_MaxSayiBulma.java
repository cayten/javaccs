package day21_arrays;

public class C01_Array_MaxSayiBulma {
    public static void main(String[] args) {
        // Soru 1- Verilen bir int array'deki
        // en buyuk sayiyi yazdiran bir method olusturun.
        int [] sayilar={3,5,7,9,8,19,45,46,44,90};

        maxSayi(sayilar);
    }

    private static void maxSayi(int[] maxsayi) {

        int enbuyuksayi=0;
        for (int i = 1; i <maxsayi.length ; i++) {
            if (maxsayi[i]>enbuyuksayi){
                enbuyuksayi=maxsayi[i];
            }
        }
        System.out.println("Listedeki en buyuk sayi "+enbuyuksayi);
    }
}
