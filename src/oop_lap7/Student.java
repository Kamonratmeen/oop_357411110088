package oop_lap7;
//Talking about Student?
//1.student ID รหัส
//2.Major สาขา
//3.Faculty คณะ
//4.Name ชื่อ

public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", faculty='" + faculty + '\'' +
                ", name='" + name + '\'' +
                '}';
    }//to string

    public static String gender = "Mal";
    private String id;
    private String major;
    private String faculty;
    private String name;
    //Constructor
    //Default constructor
    public Student(){}
    //create constructor by owner
    public Student(String id,String m,String f,String n){
        //assign data to class properties
        this.id = id;
        this.faculty = f;
        this.major = m;
        this.name = n;
    }
//getter and setter methods

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}//class
