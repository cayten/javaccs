package day21_arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan aldiginiz bir ismin verilen array de olup olmadigini kontrol edip,
        // bize true veya false sonucu donen bir method olusturun.

        String[] isimListesi={"Canan","Ayten","cuneyt","ibrahim","ayse"};
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen aramak istediginiz ismi giriniz");
        String arananisim=scan.nextLine();

        boolean sonuc=iceriyorMu(isimListesi,arananisim);
        if (true){
            System.out.println("aradiginiz isim listede var");
        }else{
            System.out.println("aradiginiz isim listede yok");
        }

    }



    public static boolean iceriyorMu(String[] isimler,String  arananisim) {


        boolean sonuc=false;


        for (int i = 0; i <isimler.length ; i++) {

            if (isimler[i].equalsIgnoreCase(arananisim)){
                sonuc=true;

            }


        }


        return sonuc;
    }
}
