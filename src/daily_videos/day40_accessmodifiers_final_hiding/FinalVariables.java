package daily_videos.day40_accessmodifiers_final_hiding;

public class FinalVariables {
    public final int ROADSTER_MAX_RANGE = 600;
    public final int MODEL_3_MAXSPEED;
    public final int MODEL_X_PASSENGERS;
    public static final String ADMIN_USERNAME; // Where this variable will be initialize ?

    public FinalVariables(){
        MODEL_3_MAXSPEED = 200;
    }

    {
        MODEL_X_PASSENGERS = 7;
    }

    static {
        ADMIN_USERNAME = "Murat";
    }

    public static void main(String[] args) {
        final int MAX_PASSENGERS_COUNT = 5;

        final int SSN;
        SSN = 66 ;

        FinalVariables finalVariables = new FinalVariables();
        System.out.println(finalVariables.ROADSTER_MAX_RANGE);
        System.out.println(finalVariables.MODEL_3_MAXSPEED);
        System.out.println(ADMIN_USERNAME);
        System.out.println(FinalVariables.ADMIN_USERNAME); // two of them is same in same class

        mA();
        FinalVariables.mA(); // two of them is same in same class
    }

    public static void mA(){

    }
}
