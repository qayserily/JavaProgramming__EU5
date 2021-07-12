package live_review_sections.week14;

public class ThrowKeyboard {
    public static void main(String[] args) {

        String browser = "Cybertek"; //chrome,firefox,safari,opera...

        switch (browser){
            case "chrome" :
                System.out.println("Chrome Browser is selected");
                break;
            case "Firefox" :
                System.out.println("Firefox Browser is selected");
            case "Safari" :
                System.out.println("Safari Browser is selected");
            case "Opera" :
                System.out.println("Opera Browser is selected");
            default:
                throw new RuntimeException("Invalid Browser Name");

        }
        System.out.println("Test Case is started");
        try {
            throw new BreakTimeException("It's time for a short break");
            //throw new String("Hello");
        }catch (BreakTimeException e){
            e.printStackTrace();
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Test case 2 started");


    }
}
