package daily_videos.day40_accessmodifiers_final_hiding;

public class Marsupial {
    public boolean isBiped(){
        return false;
    }
    public void getMarsupialDescription(){
        System.out.println("Marsupial walks on the two legs: " + isBiped());
    }
}
