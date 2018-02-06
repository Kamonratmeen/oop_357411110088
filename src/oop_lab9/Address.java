package oop_lab9;

public class Address {
    private String homeNO;
    private String province;
    private String postCode;

//constructor
    public Address(String homeNO, String province, String postCode) {
        this.homeNO = homeNO;
        this.province = province;
        this.postCode = postCode;
    }

    //toString
    @Override
    public String toString() {
        return "Address{" +
                "homeNO='" + homeNO + '\'' +
                ", province='" + province + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }

    //Getter and getter
    public String getHomeNO() {
        return homeNO;
    }

    public void setHomeNO(String homeNO) {
        this.homeNO = homeNO;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}//class
