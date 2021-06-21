package daily_videos.day40_accessmodifiers_final_hiding;

public class TestParentChild {
    public static void main(String[] args) {
        Child s = new Child();
        System.out.println("Value of x before increment " + s.x);

        s.increment();

        System.out.println("Value of x after increment " + s.x);

        Parent p = new Parent();
        System.out.println("Value of x before increment " + s.x);

        p.increment();
        System.out.println("Value of x after increment " + s.x);

    }
}
