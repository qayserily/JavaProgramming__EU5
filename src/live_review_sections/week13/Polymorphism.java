package live_review_sections.week13;

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        animal1.eat();
        ((Dog) animal1).bark(); //downcasting
        //((Eagle) animal1).fly(); // IS a relation ship is

        Animal animal2 = new Lion();
        Animal animal3 = new Eagle();



    }
}
