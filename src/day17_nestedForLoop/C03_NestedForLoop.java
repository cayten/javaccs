package day17_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
         /*
      verilen yukseklik ve boy degerine gore
      *'lardan olusan bir dikdortgen olusturalim
      yukseklik :3  boy:4
      * * * *
      * * * *
      * * * *
     */


        int satir=3;
        int sutun=4;

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
    }

