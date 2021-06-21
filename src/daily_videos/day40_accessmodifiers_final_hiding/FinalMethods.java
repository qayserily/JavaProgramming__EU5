package daily_videos.day40_accessmodifiers_final_hiding;

public class FinalMethods {
    public final void method1(){
        System.out.println("Methode-1");

        String x = "apple";
    }

    public final static void staticMethod(String word){
        System.out.println("Static Method");
    }
}

class Sub extends FinalMethods{
    /*
    public void method1(){
        System.out.println("Method-1 in sub class");
    }
    public static void staticMethod(String w){
        System.out.println("Static method in sub class");
    }*/


}
