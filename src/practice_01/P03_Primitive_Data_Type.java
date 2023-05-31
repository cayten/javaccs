package practice_01;

public class P03_Primitive_Data_Type {

    public static void main(String[] args) {
        /*
     * Primitive data type
            byte: only takes whole numbers
            short: only takes whole numbers
            int(used more often): only takes whole numbers
            long: only takes whole numbers
            float: can take decimals (MUST have F or f at the end)
            double( used more often): can take decimals
            boolean: true or false boolean expressions
            char: character within single quote ''
                    also takes number
     * Range: double > float >long > int >short > byte
     */

        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

        int intmax=Integer.MAX_VALUE;
        int intmn=Integer.MIN_VALUE;

        System.out.println("intmn = " + intmn);
        System.out.println("intmax = " + intmax);

        byte bytemax=Byte.MAX_VALUE;
        byte bytemin=Byte.MIN_VALUE;

        System.out.println("bytemin = " + bytemin);
        System.out.println("bytemax = " + bytemax);

        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)

         //Degiskenler icin anlamli isimler kullanip, yazdiralim

        double kilometre=50.25;
        char note='B';
        boolean hastaMi=true;
        float arabafiyati=99999.99f;

        System.out.println("arabafiyati = " + arabafiyati);
        System.out.println("hastaMi = " + hastaMi);
        System.out.println("note = " + note);
        System.out.println("kilometre = " + kilometre);





    }
}
