package Quiz1;

public class ex1 {
    public static void main(String[] args) {
        int count = 0;
        int total = 0;
        for (int i = 500; i < 1000; i++){
            if (i%3==0 || i%6==0) {
                count++;
                total += i;

                System.out.println(i + " ");
            }
        }
    }
}
