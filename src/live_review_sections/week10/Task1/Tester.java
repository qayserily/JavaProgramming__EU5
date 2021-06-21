package live_review_sections.week10.Task1;

public class Tester extends Employee {

        public Tester(String name, String gender, String jobTitle, int employeeId, double salary){
            super(name, gender, jobTitle, employeeId, salary);
        }

        public void smokeTesting(){
            System.out.println(name+ " is smoke testing");
        }

        public void creatingTicket() {
            System.out.println(name+ " is creating ticket");
        }


}
/*
2. create a class called Tester
                    Attributes:
                        name, employeeID, JobTitle, Salary

                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket()

 */