package live_review_sections.week13.Tasks.Task2;

public abstract class Car {

    public String make;
    public String model;
    public int year;
    public String color;

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "live_review_sections.week13.Tasks.Task2.Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract void start();

}

