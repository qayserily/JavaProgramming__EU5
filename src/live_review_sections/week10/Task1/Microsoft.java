package live_review_sections.week10.Task1;

public class Microsoft {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Murat", "Male" , "SDET" , 123, 100000);
        Tester tester2= new Tester("Umut", "Male" , "SDET" , 456, 110000);
        Tester tester3 = new Tester("Neşe", "Female" , "SDET" , 789, 120000);

        Tester[] testers = {tester1,tester2,tester3};

        Developer developer1 = new Developer("Esra" , "Female" , "Java Developer" , 2422 , 120000);
        Developer developer2= new Developer("Esat" , "Male" , "Java Developer" , 4245 , 135000);
        Developer developer3 = new Developer("Bayram" , "male" , "Java Developer" , 5869 , 145000);
        Developer developer4 = new Developer("Ultraslan" , "male" , "Java Developer" , 545 , 175000);

        Developer[] developers = {developer1,developer2,developer3,developer4};

        System.out.println(tester1);
        System.out.println(developer1);
        tester1.creatingTicket();
        developer1.coding();

        ScrumTeam scrum1 = new ScrumTeam("Fatih" , "Terim", "Arda");
        scrum1.addDeveloper(developers);
        scrum1.addTester(testers);

        System.out.println("Total Number of testers : " + scrum1.testers.size());
        System.out.println("Total Number of developers : " + scrum1.developers.size());

        System.out.println(scrum1);

    }
}
