package oop_lap7;
//Talking ?
//1.car brand
//2.car color
//3.car engine size ขนาดเครื่องยนต์ของรถ
//4.max speed ความเร็วสูงสุด
//5.country of origin ประเทศต้นทาง


public class SuperCar {
    private String carBrand;
    private String carColor;
    private String engSize;
    private String maxspeed;
    private String origin;

    public SuperCar (){}
    public SuperCar (String b,String c,String e,String m,String o){
        this.carBrand = b;
        this.carColor = c;
        this.engSize = e;
        this.maxspeed = m;
        this.origin = o;
    }

    public String getSuperCarInfo() {
        return "SuperCar{" +
                "carBrand='" + carBrand + '\'' +
                ", carColor='" + carColor + '\'' +
                ", engSize='" + engSize + '\'' +
                ", maxspeed='" + maxspeed + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }


    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getEngSize() {
        return engSize;
    }

    public void setEngSize(String engSize) {
        this.engSize = engSize;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {

        this.maxspeed = maxspeed;
    }

    public String getOrigin() {

        return origin;
    }

    public void setOrigin(String origin) {

        this.origin = origin;
    }
}//class
