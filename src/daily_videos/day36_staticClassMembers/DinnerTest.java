package daily_videos.day36_staticClassMembers;

public class DinnerTest {
    public static void main(String[] args) {
        Dinner mom = new Dinner();
        Dinner kid = new Dinner();
        Dinner dad = new Dinner();

        System.out.println("Total slices : " + mom.pizzaslice);

        dad.takeASlice();
        kid.takeASlice();
        mom.takeASlice();

        System.out.println(dad.pizzaslice);

        kid.takeASlice(3);
        dad.takeASlice(2);
        //mom.takeASlice();

        System.out.println(Dinner.pizzaslice);
    }
}
