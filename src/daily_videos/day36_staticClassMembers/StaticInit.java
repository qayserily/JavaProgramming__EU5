package daily_videos.day36_staticClassMembers;

public class StaticInit {

    static final int NUM_SECONDS_PER_HOURS;

    static {
        System.out.println("Static init");
        int numSecondPerMinute=60;
        int numMinutePerHour= 60;
        NUM_SECONDS_PER_HOURS= numMinutePerHour*numSecondPerMinute;
    }

    private static int one ;
    private static final int two;
    private static final int three= 3;
    //private static final int four;

    static {
        one=1;
        two = 2;
        //three =4;
        //two=4;

    }
}
