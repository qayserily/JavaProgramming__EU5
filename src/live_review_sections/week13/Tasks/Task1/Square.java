package live_review_sections.week13.Tasks.Task1;

public class Square extends Shape{
    public Square(String name) {
        super(name);
    }

    @Override
    public void area() {
        int a = 0;
        System.out.println("Area of square : " + (a*a));
    }

    @Override
    public void perimeter() {
        int a = 0;
        System.out.println("Perimeter of Square : " + (4*a));
    }
}
