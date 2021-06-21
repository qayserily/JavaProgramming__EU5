package live_review_sections.week12;

public class ShapeObject {
    public static void main(String[] args) {
        //Shape shape1 = new Shape("Shape") // cannot create object from abstract class
        Rectangle rectangle = new Rectangle(3,5);
        Circle circle = new Circle(2.5);

        System.out.println("circle = " + circle);
        System.out.println("rectangle = " + rectangle);

    }

}
