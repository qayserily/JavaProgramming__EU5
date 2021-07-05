package daily_videos.day44_oopreview.shapes;

import java.util.List;
import java.util.Locale;

public class ShapeManager {

    public static Shape buildShape(String type){
        Shape shape=null;

        switch (type.toLowerCase()){
            case "shape":
                shape = new Shape();
                break;
            case "diamond":
                shape = new Diamond();
                break;
            case "square":
                shape = new Square();
                break;
        }
        return shape;
    }

    public static void drawSquare(Square squareObject){
        //draw method from square class
        squareObject.draw();
    }

    public static void drawShape(Shape shapeObject){
        shapeObject.draw();
    }

    public static void drawShape(List<Shape> shapeList){
        //i want to run each draw method
        for (Shape each: shapeList) {
            each.draw();
        }
    }
}
