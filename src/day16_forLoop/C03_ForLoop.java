package day16_forLoop;

public class C03_ForLoop {
    public static void main(String[] args) {

        //10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin

        int ilk=10;
        int son=30;

        for (int i =ilk ; i <=son ; i++) {
            if (i<son){
                System.out.print(i+",");
            }else System.out.print(i);
        }



    }
}
