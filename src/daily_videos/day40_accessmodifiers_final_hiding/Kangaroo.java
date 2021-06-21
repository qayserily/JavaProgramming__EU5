package daily_videos.day40_accessmodifiers_final_hiding;

public class Kangaroo extends Marsupial{
    public boolean isBiped(){
        return true;
    }
    public void getKangarooDescription(){
        System.out.println("Kangaroo hops on two legs : " + isBiped());
    }
}
