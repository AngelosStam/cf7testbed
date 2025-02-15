package gr.aueb.cf.ch12;

public class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student();

        student.setId(1);               //student.id = 1;
        student.setFirstname("Alice");  //student.firstname = "Alice";
        student.setLastname("W.");      //student.lastname = "W.";

        System.out.println("Id: " + student.getId());
        System.out.println("Firstname: " + student.getFirstname());
        System.out.println("Lastname: " + student.getLastname());
    }
}
