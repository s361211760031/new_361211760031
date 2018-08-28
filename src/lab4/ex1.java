package lab4;

public class ex1 {
    public static void B (String msg){
        System.out.println("Hello B "+ msg);
    }//B

    public static void main(String[] args) {
        System.out.println("Hello Main");
        //calling A()
        A();
        A();
        //calling B()
        B("Som");
        //calling C ()
        int result = C(10, 10);
        System.out.println(result);
        System.out.println(C(10,10));
    }//main

    public static void A() {
        System.out.println("Hello A");
    }//A

    public static int C (int x, int y) {
        System.out.println("Hello C");
        int sum = x + y;
        return sum;   //x+y;
    }//C








}//class
