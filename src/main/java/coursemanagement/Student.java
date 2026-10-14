package coursemanagement;

public class Student {

    int studentId;
    String studentName;
    String email;

    public Student(int studentId, String studentName, String email) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
    }

    public void displayStudent() {

        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Email: " + email);
        System.out.println("-----------------------------");
    }
}