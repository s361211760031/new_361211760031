package lab8;

public class Exception2 {
    public static void main(String[] args) {
        int[] number = new  int[2];

        try {
            System.out.println(number[3]);
        } catch (Exception ex) {
            System.out.println("Exception: "+ex);
        }finally {
            number[0] = 6;
            System.out.println("array number[0]:"+number[0]);
        }


    }
}
