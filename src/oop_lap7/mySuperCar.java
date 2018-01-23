package oop_lap7;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {



        SuperCar superCar2 = new SuperCar();
        superCar2 = inputData(superCar2);
        System.out.println(superCar2.toString());

    }//main

    private static SuperCar inputData(SuperCar  s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your SuperCar data: ");
        System.out.print("brand: ");
        s.setCarbrand(scanner.nextLine());
        System.out.print("color: ");
        s.setCarcolor(scanner.nextLine());
        System.out.print("size: ");
        s.setCarenginesize(scanner.nextLine());
        System.out.print("speed: ");
        s.setMaxspeed(scanner.nextLine());
        System.out.print("country: ");
        s.setCountryoforigin(scanner.nextLine());
        return s;

    }//main




}//class
