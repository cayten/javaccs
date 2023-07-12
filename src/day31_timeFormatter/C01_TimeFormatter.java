package day31_timeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println("ilk olusturulan tarih "+tarihSaat);//2023-07-11T18:44:38.423903500

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MMM/yyyy HH:mm");//
        System.out.println(dtf.format(tarihSaat));//11-Jul/2023 18:48

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/M/yy hh:mm a");
        System.out.println(dtf1.format(tarihSaat));//11/7/23 06:49 PM
    }
}
