package daily_videos.day40_accessmodifiers_final_hiding;

import java.util.ArrayList;

public class FinalArrayList {
    public static void main(String[] args) {
        ArrayList<String> COLORS = new ArrayList<>();

        COLORS.add("Orange");
        COLORS.add("Red");
        COLORS.remove(0);

        //COLORS = new ArrayList<String>();

    }
}
