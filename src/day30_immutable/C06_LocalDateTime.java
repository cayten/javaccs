package day30_immutable;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();

        System.out.println(tarihSaat);//2023-07-06T18:47:13.535847600

        System.out.println(tarihSaat.plusMonths(3).plusHours(100));//2023-10-10T22:47:56.350865100

        System.out.println(tarihSaat.minusDays(100).plusHours(100));//2023-04-01T22:48:36.544784100

        System.out.println(tarihSaat.toLocalDate());//2023-07-06

    }
}
