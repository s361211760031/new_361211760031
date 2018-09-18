package lab5;

import java.util.StringTokenizer;

public class ex6 {
    public static void main(String[] args) {
        StringBuffer myStr = new StringBuffer("Hello") ;
        System.out.println(myStr);
        System.out.println(myStr.reverse());

        myStr.append(" MIT211");
        System.out.println(myStr);
        myStr.insert(0,"RUTS");
        System.out.println(myStr);

        //StringBuilder
        StringBuilder myStr2 = new StringBuilder("Hello");
        System.out.println(myStr2);
        myStr2.reverse();
        System.out.println(myStr2);
        //StringTokenizer
        StringTokenizer myStr3 = new StringTokenizer("Hello, my name is som");
        int count = myStr3.countTokens();
        System.out.println(count);
    }
}
