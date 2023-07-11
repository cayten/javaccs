package day30_immutable;

import java.time.LocalTime;

public class C04_LocalTime {

    public static void main(String[] args) throws InterruptedException {
        LocalTime time1= LocalTime.now();
        System.out.println(time1);//19:32:41.352873700

    /*
    Bizim olusturdugumuz date ve time
    canli saat veya tarh degildir
    LocalTime.now(); kullandigimiz satirda
    o anki tarih veya saati alip
    bizim variable'imiza store eder.
    time1 variable'inin degeri SABITTIR.
     */

        Thread.sleep(3000);// zorunlu olarak 3 sn olarak bekletir.

        time1=LocalTime.now();
        System.out.println(time1);//

        System.out.println(time1.getSecond());//

        System.out.println(time1.plusSeconds(10000));//

        System.out.println(time1.minusMinutes(200));// 16:13:53.02126810

        System.out.println(time1.withHour(3));//





    }


    }

