package day18_while_doWhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
         /* soru 9 dan 190 a kadar 7 nin kati olan tum tamsayilari
    ekrana yazdiriniz */


        int baslangic=9;
        int bitis =190;
 /*    while (baslangic<=bitis){
         if (baslangic%7==0){
             System.out.print(baslangic+" ");

         }

         baslangic++;
     }

  */
        System.out.println("================DO WHILE===============");
        do {

            if (baslangic%7==0){
                System.out.print(baslangic+" ");
            }
            baslangic++;




        }while (baslangic<=bitis);
    }
}
