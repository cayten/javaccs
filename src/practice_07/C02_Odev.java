package practice_07;

import java.util.Arrays;

public class C02_Odev {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */
        String [] kelime1= new String[1];
        String kelime="HeySiri";
        kelime=kelime.replace("Hey","Bye");

        System.out.println(kelime);
        kelime1[0]=kelime;
        System.out.println(Arrays.toString(kelime1));

    }
}
