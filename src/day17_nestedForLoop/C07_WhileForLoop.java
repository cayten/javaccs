package day17_nestedForLoop;

public class C07_WhileForLoop {
    public static void main(String[] args) {
        // 20'den 50'ye kadar(sinirlar dahil) cift sayilari yazdiralim

        // for loop ile yapalim

        int bas=30;
        int bit=50;

    /*    for (int i = bas; i <=bit ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }

     */

        while (bas<=bit){

            if (bas%2==0){
                System.out.print(bas+" ");
            }

            bas++;
        }
    }
}
