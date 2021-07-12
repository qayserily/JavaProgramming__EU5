package daily_videos.day45_exceptions;

public class TryCatch {
    public static void main(String[] args) {

        try {
            String str = "Java";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(5)); // i might have problem here
            System.out.println(str.charAt(1)); // will not be executed
        }catch (Exception e){
            System.out.println("Exception happened in try block and was caught");

        }
        System.out.println("After try catch block");
    }
}
