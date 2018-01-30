package oop_lab8;

public class PetApp {
    public static void main(String[] args) {
        Dog dog = new Dog("chayen","2");
        System.out.println(dog.toString());
        dog.makeNoies();

        Cat cat = new Cat("Giant","2","persian");
        System.out.println(cat.toString());
        cat.makeNoise();
    }//main
}//class
