package live_review_sections.week14;

import live_review_sections.week13.Animal;
import live_review_sections.week13.Dog;
import live_review_sections.week13.Lion;

public class Polymorphism {
    public static void main(String[] args) {

        int b = 10;
        double a = (double) b; // implicit casting

        short s = (short) a; //explicit casting


        System.out.println("----------------------------------");
        //reference type casting : upcasting & downcasting

        Animal animal1 = new Dog(); //upcasting
        //Animal animal1= (Animal) (new Dog());

        //animal1.bark();
        Dog dog = (Dog) animal1; // downcasting
        dog.bark();

        //Lion lion = (Lion) animal1;
      //  lion.hunting();
    }
}
