package practice_03;

public class C07_Odev {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */

        String [][] sayilar={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double carpim=1;
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=3 ; j++) {

                if (sayilar[i][j].contains("$")){

                }

            }

        }





    }
}
