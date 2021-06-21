package live_review_sections.week9;

public class Employee {

    public String jobTitle , name ;
    public int id;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String jobTitle, String name) {
        this(name);
        this.jobTitle = jobTitle;
    }

    public Employee(String jobTitle, String name, int id) {
        this(name,jobTitle);
        this.id = id;
    }

    public Employee(String jobTitle, String name, int id, double salary) {
        this(name,jobTitle,id);
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", salary=$" + salary +
                '}';
    }
}
