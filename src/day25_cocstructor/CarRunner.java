package day25_cocstructor;

public class CarRunner {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.fiyat=150000;
        car1.yil=2020;
        car1.marka="Toyota";

        System.out.println("Marka "+car1.marka+"\nModel");
    }
}
