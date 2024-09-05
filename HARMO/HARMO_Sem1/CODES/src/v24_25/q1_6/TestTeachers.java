package v24_25.q1_6;


public class TestTeachers {

    //Part I : Question 32 ------------------------
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Doe", "John");
        System.out.println(teacher1);
        System.out.println(teacher1.getFirstName());
        System.out.println(teacher1.getName());
        System.out.println(teacher1.getOffice());
        teacher1.buildOfficeName("A", 0);
        System.out.println(teacher1.getOffice());
        teacher1.buildOfficeName("A", 401);
        System.out.println(teacher1.getOffice());
        Teacher teacher2 = new Teacher("Doe", "John", "A 101");

    }
}
