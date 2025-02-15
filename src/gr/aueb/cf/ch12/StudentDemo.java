package gr.aueb.cf.ch12;

public class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student();                               //Invoke Default Constructor
        Student bob = new Student(2, "Bob", "D."); //Invoke Overloaded Constructor and populate instance

        student.setId(1);               // student.id = 1;
        student.setFirstname("Alice");  // student.firstname = "Alice";
        student.setLastname("W.");      // student.lastname = "W.";

        System.out.println("Id: " + student.getId());
        System.out.println("Firstname: " + student.getFirstname());
        System.out.println("Lastname: " + student.getLastname());

        System.out.println();

        System.out.println("Id: " + bob.getId());
        System.out.println("Firstname: " + bob.getFirstname());
        System.out.println("Lastname: " + bob.getLastname());

        System.out.println("Student instances' count: " + Student.getStudentsCount());
    }
}
