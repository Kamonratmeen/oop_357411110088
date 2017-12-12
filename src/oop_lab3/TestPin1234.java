package oop_lab3;

import java.util.Scanner;

public class TestPin1234 {
    public static void main(String[] args) {

        String PIN = "1234", input;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter PIN: ");
            input = scanner.nextLine();
            if (PIN.equals (input)) {
                System.out.println("Welcome.");
                break;
            } else {
                count++;
                if (count == 3) {
                    System.out.println("Locked");
                    break;
                }
            }
        } while (count <= 3);
    }//main


}//class
