package daily_videos.day43_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapesArray {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Shape();

        shapes[1] = new Triangle();

        shapes[2] = new Circle();

        for (Shape sh : shapes) {
            System.out.println(sh.getClass().getName());
            System.out.println(sh.getClass().getSimpleName());
            sh.draw();
        }

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Triangle());
        shapeList.add(new Square());
        shapeList.add(new Square());



    }
}
