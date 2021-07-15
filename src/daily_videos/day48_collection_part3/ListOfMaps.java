package daily_videos.day48_collection_part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMaps {
    public static void main(String[] args) {

        List<Map<String,String>> employees = new ArrayList();

        Map<String,String> empl1data = new HashMap<>();

        empl1data.put("EmpID" , "123");
        empl1data.put("EmpName" , "John");
        empl1data.put("jobTitle" , "SDET");
        empl1data.put("Salary" , "100000");

        Map<String,String> empl2data = new HashMap<>();

        empl2data.put("EmpID" , "123");
        empl2data.put("EmpName" , "Mike");
        empl2data.put("jobTitle" , "Dev");
        empl2data.put("Salary" , "80000");

        employees.add(empl1data);
        employees.add(empl2data);
       /* employees.add(empl1data);
        employees.add(empl2data); */

        System.out.println(employees.toString());

        System.out.println(employees.size());

        System.out.println(employees.get(0));
        System.out.println(employees.get(1));

        //print each employee title by using for each loop
        //
        int totalSalary = 0;
        for (Map<String,String> emp: employees) {
          //  System.out.println(emp);
            totalSalary+=Integer.parseInt(emp.get("Salary"));
        }

        System.out.println("Total salary = " + totalSalary);
    }
}
