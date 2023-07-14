package day35_inheritancedaConsuctorKullanimi;


    public class DOgretmen {
        DOgretmen(){
            System.out.println("Ogretmen parametresiz cons");
        }
        DOgretmen(String isim){
            this();
            System.out.println("Ogretmen parametreli cons");
        }
    }
