package oop_lab5;
//1.input Data from user
//2.find summation of data in array
//3.find average value of data in array
//4.find maximum value of data in array
//5.find maximum value of data in array
//6.Sorting data with Descending Order
//7.Sorting data whit Ascending Order ข้อมูลจากมากไปน้อย

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class InputDataToArray {
    private static final Integer MAX = 10;

    public static void main(String[] args) {
        Integer num[] = new Integer[MAX];
        num = inputData(num);
        showData(num);
        summation(num);
        findMax(num);
        findMin(num);
        DescendingOrder(num);
        AscendingOrder(num);

    }//main

    private static void AscendingOrder(Integer[] num) {
        Arrays.sort(num, Collections.reverseOrder());
        showData(num);
    }//AscendingOrder เรียงข้อมูลจากมากไปน้อย

    private static void DescendingOrder(Integer[] num) {
        Arrays.sort(num);
        System.out.println("Descending Order");
        showData(num);
    }//DescendingOrder

    private static void findMin(Integer[] num) {
        System.out.println("The maximum value is: "+(Collections.max(Arrays.asList(num))));
    }//findMin

    private static void findMax(Integer[] num) {
        System.out.println("The maximum value is: "+(Collections.max(Arrays.asList(num))));
    }//findMax
    private static void summation(Integer[] num) {

        int total = 0;
        for (int i=0;i<num.length;i++){
            total += num[i];
        }
        System.out.println("\nThe summation of " + " Value in array is: "+total);
        System.out.println("The average value " + " in array is: "+total/MAX);

    }//summation

    private static void showData(Integer[] num) {
        System.out.println("Data in array: ");
        Integer total = 0;
        for (int i=0;i<num.length;i++) {
            total += num[i];
        }
        System.out.println("\nThe summation of " + "value in array is: "+total);
        System.out.println("The average value " + "in array is: "+total/MAX);

    }



    private static Integer[] inputData(Integer []num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese enter data to array: ");
        for (int i=0;i<num.length;i++){
            System.out.print("num["+i+"]: ");
            num[i] = scanner.nextInt();

        }
        return num;
    }


}//class
