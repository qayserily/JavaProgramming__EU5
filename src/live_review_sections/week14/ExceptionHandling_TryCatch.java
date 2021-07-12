package live_review_sections.week14;

import java.util.Arrays;

public class ExceptionHandling_TryCatch {
    public static void main(String[] args) {

        try {
            System.out.println( 10/0 ); // exception object will be created
        }catch(ArithmeticException e) {
            //System.out.println( e.getMessage() );
            //	e.printStackTrace();
        }


        try {
            System.out.println("Hello");
        }catch(RuntimeException e) {
            e.printStackTrace();
        }


        System.out.println("Test 1 Completed");


        int[] number = {1,2,3,4,5};

        try {
            System.out.println(number[10]);
            System.out.println(Arrays.toString(number));
            System.out.println("Try Block");
        }catch(RuntimeException e) {
            System.out.println("Catch Block");
        }

        System.out.println("Test 2 completed");

        System.out.println("--------------------------------");

        try {
            Thread.sleep(1000);
            System.out.println("Try Block");
        }catch (Exception e) {
            System.out.println("Catch Block");
        }

        System.out.println("Test 3 Completed");



        System.out.println("---------------------------------");

        try {
            System.out.println("Cybertek".charAt(200));
            System.out.println("Try Block");
        }catch(RuntimeException e) {
            System.out.println("Catch Block");
            //	System.exit(0); terminates the program
        }finally {
            System.out.println("Finally Block");
        }

        //all the checked exceptions are predictable, because compiler will let you know. The only exceptions that are not predictable are unchecked exceptions
        // which will not occur until you run your codes. and throws keyword can NEVER handle unchecked exceptions

        System.out.println("Test 4 Completed");
        System.out.println("---------------------------------");



    }
}
