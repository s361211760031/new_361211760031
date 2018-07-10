package lab2;

import java.io.IOException;

public class exRead {

    public static void  main(String[] args) throws IOException {
        char c;
        System.out.print("Please enter one character: ");
        c=(char)System.in.read();
        System.out.println(c);

        System.out.print("How own are you? :");
        int age = 0;
        age = (int)System.in.read();
        System.out.println("Your are "+age+" years old");



    }//end main
}// end exRead
