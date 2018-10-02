package lab7;

public class StudentApp {

    public static void main(String[] args) {

        Student std = new Student("Som","031","supanee.som40@gmail.com","0986754231",21);

        System.out.println(std.toString());

        std.setName("Supanee");

        System.out.println(std.toString());



    }



}
