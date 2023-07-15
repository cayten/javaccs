package day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
        int a=100;
        int b=500;
        int sayac=1;

        while ( sayac<100){
            System.out.println(a/b);



            if (b==0){
                System.out.println("islem yapilirken payda sifir oldu, dikkat etmelisiniz");
            }else {
                System.out.println(a/b);
            }

            b--;
            sayac++;
        }
    }
}
