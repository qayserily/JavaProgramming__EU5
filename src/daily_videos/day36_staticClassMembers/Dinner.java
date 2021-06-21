package daily_videos.day36_staticClassMembers;

public class Dinner {
    static int pizzaslice = 8 ;

    public void takeASlice(){
        pizzaslice--;
    }
    public void takeASlice(int count){
        pizzaslice-=count;
    }
}
