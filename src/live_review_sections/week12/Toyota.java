package live_review_sections.week12;

public class Toyota extends Car{ // Toyota is a car.

    public Toyota(String model, String color, int year) {
        super("Toyota", model, color, year);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition...");
    }
}
