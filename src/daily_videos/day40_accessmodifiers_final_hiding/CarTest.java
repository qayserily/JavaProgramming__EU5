package daily_videos.day40_accessmodifiers_final_hiding;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "M3";
        car.year = 2017;
        //car.door = 4;
        car.engine = 5.3;

        System.out.println(car.toString());

    }
}
