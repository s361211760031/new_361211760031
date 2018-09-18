package lab5;

public class ex5 {
    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "Hello";
        String msg3 = "hello";

        if (msg1.equals(msg2)) System.out.println(true);
        else System.out.println(false);
        if (msg1.equals(msg3)) System.out.println(true);
        else System.out.println(false);

        //
        if (msg1.compareTo(msg3)==0) System.out.println("Tow string is equal");
        else if (msg1.compareTo(msg3)>= 1)
            System.out.println("msg1 more than msg3");
        else System.out.println("msg1 less than msg3");
    }
}
