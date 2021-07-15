package daily_videos.day48_collection_part3;

import daily_videos.day46_collection_part1.Product;

import java.util.HashSet;
import java.util.Set;

public class HashSetOfProducts {
    public static void main(String[] args) {
        //create set collection ans add new products
        Set<Product> prodSet = new HashSet<>();
        prodSet.add(new Product("book",25.99));
        prodSet.add(new Product("book",19.99));
        prodSet.add(new Product("magazine",7.99));

        System.out.println(prodSet.toString());

        //print each product by using for each loop
        for (Product p : prodSet) {
            System.out.println(p.getPrice());
        }

        //print each product by using forEach method
        prodSet.forEach(p ->System.out.println(p.getName()));
    }
}
