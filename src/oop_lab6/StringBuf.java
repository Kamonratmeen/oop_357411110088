package oop_lab6;

public class StringBuf {
    public static void main(String[] args) {
        // StringBuffer
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append(" Welcome");
        buffer.append(" to");
        buffer.append(" RMUTSV");
        System.out.println(buffer);
        System.out.println(buffer.length());
        buffer.replace(0,5,"oop");
        System.out.println(buffer);
       // System.out.println(buffer.replace());
        buffer.delete(0, 3);
        System.out.println(buffer);



    }//main
}//class
