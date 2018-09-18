package lab5;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        System.out.println("Input data to Array 2D: ");
        //create array
        int[][] num = new int[2][3];  // 2 rows and 3 columns = 6 elements

        num = inputData(num);
        showData(num);
    }

    private static void showData(int[][] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int [][] inputData(int[][] num) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print("enter integers: ");
                num[i][j] = sc.nextInt();
            }
        }
        return  num;
    }
}
