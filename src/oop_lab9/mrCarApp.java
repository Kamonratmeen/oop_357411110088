package oop_lab9;

public class mrCarApp {
    public static void main(String[] args) {
        //engine
        Engine engine = new Engine("1500 cc","V-TEC V4");



        //Car
        Car car = new Car("Honda","Black",engine);

        System.out.println(car.toString());

        Car car1 = new Car("Honda","Red", engine);
        System.out.println(car.toString());



    }//main



}//class
