package daily_videos.day41_abstraction;

public abstract class Animal {
    public Animal(String name){

    }
    public abstract void eat();
    public abstract void breathe();
    public void move(){
        System.out.println("Moving");
    }
}
