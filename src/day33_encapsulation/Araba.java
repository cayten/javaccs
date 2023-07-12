package day33_encapsulation;

public class Araba {


    String marka="Marka Belirtilmedi";// marka nin access modifier i default access modifier oldugundan package icerisinde kullanilabilir
    private String model="Model Belirtilmedi";
    private String yakit="Elektrikli"; //"Elektrikli" dersek tum arabalar elektrikli ise bu variable in degistirilmemesi lazim
    // private yaptigimiz model ve yakit variable larina erisimi yetkilendirelim
    // modele deger atanabilsin ama gorunemesin
    // yakit ise gorulebilsin ama yeni deger atanamasin isteniyor

    public void setModel(String model){
        this.model=model;

    }
    public String getYakit(){
        return yakit;
    }
}
