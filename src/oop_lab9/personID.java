package oop_lab9;

public class personID {
    private String personID;
    private String name;
    private String Address;
    private String Job;

    public personID(String personID, String name, String address, String job) {
        this.personID = personID;
        this.name = name;
        this.Address = address;
        this.Job = job;
    }

    @Override
    public String toString() {
        return "personID{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", Job='" + Job + '\'' +
                '}';
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }
}//class
