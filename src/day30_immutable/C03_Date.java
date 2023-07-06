package day30_immutable;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {

    public static void main(String[] args) {
        LocalDate tarih= LocalDate.now();


        System.out.println(tarih); // 2023-07-06

        System.out.println(tarih.getDayOfYear());//187
        System.out.println(tarih.getDayOfWeek());//THURSDAY
        System.out.println(tarih.getDayOfMonth());//6
        System.out.println(tarih.getMonthValue());//7
        System.out.println(tarih.isLeapYear());//false

        LocalDate tarih2= LocalDate.of(1990,10,01);//1990-10-01
        System.out.println(tarih2);

        LocalDate tarih3= LocalDate.of(1994, Month.JANUARY,10);//1994-01-10
        System.out.println(tarih3);

        System.out.println(tarih.plusDays(100));//2023-10-14

        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));//2028-10-18

        System.out.println(tarih.minusWeeks(20));//2023-02-16
    }
}
