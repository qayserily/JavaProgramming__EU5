package daily_videos.day42_interface;

public class ElectricCarTest {
    public static void main(String[] args) {

     /*   ElectricCar ec = new ElectricCar() {
            @Override
            public void start() {

            }

            @Override
            public void charge() {

            }

            @Override
            public void drive() {

            }
        } */

        Tesla modelS = new Tesla("Model S" , 45000 , "Grey");
        modelS.charge();
        modelS.start();
        modelS.drive();
        modelS.stop();

        System.out.println("*****************************************************************************************");

        Ford fusion = new Ford("Fusion" , 35000, "Black" , 2017);
        fusion.charge();
        fusion.drive();
        fusion.start();
        fusion.stop();

        System.out.println("*****************************************************************************************");

        TeslaSemi semi = new TeslaSemi("Semi",50000, "Brown", 3.5);
        semi.charge();
        semi.drive();
        semi.load("Oranges");
        semi.drive();
        semi.stop();

        System.out.println("*****************************************************************************************");

        TeslaTruck truck = new TeslaTruck("Cybertek" , 100000 , "White" , 6.0);
        truck.charge();
        truck.drive();
        truck.load("Java Books ");
        truck.start();
        truck.stop();

        System.out.println("*****************************************************************************************");

        System.out.println(modelS.toString());
        System.out.println(fusion.toString());
        System.out.println(truck.toString());
        System.out.println(semi.toString());
    }
}
