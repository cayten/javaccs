package day21_arrays;

import java.util.Arrays;

public class C09_BinarySearch {
    public static void main(String[] args) {
     /*

    binarySearch method u siralanmis array de aradigimiz elementin index ini dondurur
    Ya aradigimiz element arrayu de yoksa ?
    (String de indexOf bize olmayan element ler icin -1 dondururyordu)
    Aradigimiz element array ed yoksa Java hem olmadigini hem de olsaydi nerede
    olacagini bize dondurur

    olmadigini ifade icin - kullanır
    olsaydi nerede olacagini belirtmek icin index degil siralama kullanir


     */
        int [] sayilar={3,7,15,4,27,10};

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.binarySearch(sayilar,4));//1
        System.out.println(Arrays.binarySearch(sayilar,15));//4
        System.out.println(Arrays.binarySearch(sayilar,11));//-5
        System.out.println(Arrays.binarySearch(sayilar,6));//-3
        System.out.println(Arrays.binarySearch(sayilar,-100));//-1







    }
}
