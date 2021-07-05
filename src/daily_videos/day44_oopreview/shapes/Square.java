package daily_videos.day44_oopreview.shapes;

public class Square extends Shape{
    public Square(){
        type= "diamond";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
    public void squareMethod(){
        System.out.println("Square method");
    }

}
