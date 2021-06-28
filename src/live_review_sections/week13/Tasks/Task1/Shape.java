package live_review_sections.week13.Tasks.Task1;

public abstract class Shape {

    public String name ;

    public Shape(String name) {
        this.name = name;
    }

    public abstract void area();

    public abstract void perimeter();

    @Override
    public String toString() {
        return "live_review_sections.week13.Tasks.Task1.Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
