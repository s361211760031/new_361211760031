package lab5;

//1. create method to find maximum data
//2. create method to find minimum data
//3. create method to find average value
//4. create method to sort data in array  (low-high)****

import java.util.Arrays;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];  //default = 0

        System.out.println("Please, input integers to array.");
        //input
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter integer "+(i+1)+":");
            num[i] = scanner.nextInt();
        }
        showData(num);
        findMax(num);
        findMin(num);
        findAverage(num);
        sortData(num);

    }//main

    private static void sortData(int[] num) {
        Arrays.sort(num);
        System.out.println();
        showData(num);

    }

    private static void findAverage(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];  // sum = sum+num[i];

        }//loop
        System.out.println("The average value is "+(sum/num.length));

    }

    private static void findMax(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max <= num[i]) {
                max = num[i];
            }
        }//loop
        System.out.println();
        System.out.println("The maximum value is " + max);
    }
    private static void findMin(int[] num) {
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (min >= num[i]) {
                min = num[i];
            }
        }//loop
        System.out.println("The minimum value is " + min);
    }



    private static void showData(int[] num) {
        for (int val : num) {
            System.out.print(val+"  ");
        }
    }


}//class