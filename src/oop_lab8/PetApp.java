package oop_lab8;

import oop_lab9.Cow;

public class PetApp {
    public static void main(String[] args) {
        Dog dog = new Dog("chayen","2");
        System.out.println(dog.toString());
        dog.makeNoies();
        dog.myPet();

        Cat cat = new Cat("Giant","2","persian");
        System.out.println(cat.toString());
        cat.makeNoise();
        dog.myPet();

        Cow caw = new Cow("Namjai",5);
        System.out.println(caw.toString());
        caw.makeNoies();
        caw.myPet();
    }//main
}//class
