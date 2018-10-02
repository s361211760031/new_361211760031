package lab7;

public class RectangleApp {

    public static void main(String[] args) {
        //create object of Rectangle

        Rectangle box1 = new Rectangle();

        box1.setLength(5.0);
        box1.setWidth(5.0);


        System.out.println( box1.getLength());
        System.out.println( box1.getWidth());

        Rectangle box2 = new Rectangle(8.0,8.0);

        System.out.println( box2.getWidth());
        System.out.println( box2.getWidth());

        System.out.println("Box1 : "+ box1.getArea());
        System.out.println("Box2 : "+ box2.getArea());



    }



}
