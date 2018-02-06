package oop_lab9;

public class Car {
    private String brand;
    private String color;
    private Engine engin;


    //constructor
    public Car(String brand, String color, Engine engin) {
        this.brand = brand;
        this.color = color;
        this.engin = engin;
    }

    //getter and setter methor


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngin() {
        return engin;
    }

    public void setEngin(Engine engin) {
        this.engin = engin;
    }

    //toString
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", engin=" + engin +
                '}';
    }
}//class
