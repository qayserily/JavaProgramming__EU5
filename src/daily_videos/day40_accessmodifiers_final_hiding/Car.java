package daily_videos.day40_accessmodifiers_final_hiding;

public class Car {

    String model ;
    public int year ;
    private int door ;
    protected double engine;

    @Override
    public String toString() {
        return "daily_videos.day40_accessmodifiers_final_hiding.Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", door=" + door +
                ", engine=" + engine +
                '}';
    }
}
