package lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exBufferReader {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What is your name?: ");
        String name = reader.readLine();
        System.out.print("How own are you?: ");
        int age = Integer.parseInt(reader.readLine());
        System.out.print("How much do you weigh?: ");
        int weigh = Integer.parseInt(reader.readLine());

        System.out.println("Hello, "+name);
        System.out.println("Your are "+age+" yeaes old.");
        System.out.println("Your are "+weigh);









    }//main



}//class
