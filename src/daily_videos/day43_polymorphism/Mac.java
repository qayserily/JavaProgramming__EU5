package daily_videos.day43_polymorphism;

public class Mac extends AppleDevice{
    @Override
    public void use() {
        System.out.println("Mac | code | Play");
    }

    public void code(){
        System.out.println("Mac is coding");
    }
}
