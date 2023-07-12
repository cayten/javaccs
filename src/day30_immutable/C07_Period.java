package day30_immutable;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        // iki tarih arasindaki sureyi bulma

        LocalDate tarih1= LocalDate.of(1972,1,18);

        LocalDate bugun = LocalDate.now();

        Period period= Period.between(bugun,tarih1);
        System.out.println(period);//P-51Y-5M-19D

        System.out.println(period.getYears());//-51
    }
}
