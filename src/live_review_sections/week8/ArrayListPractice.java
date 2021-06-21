package live_review_sections.week8;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1 ;
        array[1] = 2 ;
        array[2] = 3 ;
        array[3] = 4 ;
        array[4] = 5 ;

        System.out.println(Arrays.toString(array));

        System.out.println("----------------------------------------------------------------------------------------");

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        arrayList.remove(3);
        System.out.println(arrayList);
    }
}
