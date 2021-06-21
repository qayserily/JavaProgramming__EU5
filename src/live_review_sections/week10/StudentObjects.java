package live_review_sections.week10;

public class StudentObjects {
    public static void main(String[] args) {

        System.out.println(CybertekStudent.schoolName);

        System.out.println(CybertekStudent.programmingLanguage);

        CybertekStudent student1 = new CybertekStudent("Barış" , 28 , "EU5");

        CybertekStudent student2 = new CybertekStudent("Zina" , 25 , "EU4");
        System.out.println(student1);
        System.out.println(student2);
    }
}
