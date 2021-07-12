package daily_videos.day46_collection_part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingAList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JS");
        list.add("html");
        list.add("ruby");
        list.add("kotlin");
        list.add("c++");

        System.out.println("Before Sorting");
        System.out.println(list.toString());

        System.out.println("-----------------------------------------------");

        System.out.println("After sorting");
        Collections.sort(list);
        System.out.println(list.toString());

        System.out.println("-----------------------------------------------");

        List<Product> prodList = new ArrayList();
        prodList.add(new Product("spoon",13.99));
        prodList.add(new Product("bag" , 100.00));
        prodList.add(new Product("Shoes" , 59.99));
        prodList.add(new Product("computer" , 2100.99));

        System.out.println("before");
        System.out.println(prodList.toString());
        //Collections.sort(prodList);

        Collections.sort(prodList);
        System.out.println("After");
        System.out.println(prodList.toString());

        Product p1 = new Product("Spoon" , 25.34);
        Product p2 = new Product("chair" , 7.99);
        System.out.println(p1.compareTo(p2));

    }
}
