package practice_07;

public class C03_Odev {
    /*
     * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
     * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
     * istenenToplam=9;
     */
    public static void main(String[] args) {

        int sayilar[]={5,7,-6,4,2,15,3,8,1};
        int toplam=9;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = i; j < sayilar.length ; j++) {

                if (sayilar[i]+sayilar[j]==9){
                    System.out.println(sayilar[i]+" ve "+sayilar[j]+" toplami "+toplam);
                }

            }

        }

    }



}
