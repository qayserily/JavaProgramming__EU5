package daily_videos.day39_inheritance_review_access_modifiers;

public class Vehicle {
        private String name ;
        private String size ;
        private int currentVelocity ;
        private int currentDirection;

    public Vehicle(){
            this("BMW" , "4DR" , 60,50);
        }

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity= 0 ;
        this.currentDirection = 0;
    }

    public Vehicle(String name, String size, int currentVelocity, int currentDirection) {
        this.name = name;
        this.size = size;
        this.currentVelocity = currentVelocity;
        this.currentDirection = currentDirection;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer() : Steering at " + currentDirection + " degrees. ");
    }

    public void move(int velocity , int direction){
        this.currentDirection = direction;
        this.currentVelocity = velocity;
        System.out.println("Vehicle.move() : Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void stop(){
        this.currentVelocity = 0 ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getcurrentDirection() {
        return currentDirection;
    }

    public void setcurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
