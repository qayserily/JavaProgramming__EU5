package daily_videos.day42_interface;

public class TeslaSemi extends ElectricTruck{ //concrete class

    private double engineSize;

    public TeslaSemi(String model, double price, String color, double engineSize) {
        super(model, price, color);
        this.engineSize = engineSize;
    }

    @Override
    public void start() {
        System.out.println("Teslasemi - start truck by pressing the button...");
    }

    @Override
    public void charge() {
        System.out.println("Teslasemi - plugin charge for 30 mins...");
    }

    @Override
    public void drive() {
        System.out.println("Teslasemi - truck is driving with load...");

    }

    @Override
    public void load(String item) {
        System.out.println("Teslasemi - load " + item + "by lowering the truck and oprning door...");

    }

    public double getEngineSize() {
        return engineSize;
    }
}
