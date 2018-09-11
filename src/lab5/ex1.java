package lab5;

public class ex1 {
    public static void main(String[] args) {
        int number [];
        number = new int[5]; //have 5 elements index 0-4
        //default of integer array is 0
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);

        number[3] = 100;
        number[1] = number[3] * 3;


    }
}
