package day38_exceptions;

public class C02_Exceptions {

    public static void main(String[] args) {

        int a=1000;
        int b=50;
        int sayac=1;

        while (sayac<1000){

            /* try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz
            islemleri yazmak icin kullanilir

            catch den sonraki parantez karsilasmayi beedigimiz exception
             gerceklesirse kullanilir.

            catch blogu: Java ya soyledigimiz exception (istisnai durum) gertceklesirse Java nin yapmasini istedigi islem
             */
            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println("payda sifir oldu dikkatli ol");
            }

            b--;
            sayac++;


        }
    }
}
