package coursemanagement;

public class Course {

    int courseId;
    String courseName;
    String instructor;
    int duration;
    double fees;

    public Course(int courseId, String courseName, String instructor,
                  int duration, double fees) {

        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.duration = duration;
        this.fees = fees;
    }

    public void displayCourse() {

        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fees: " + fees);
        System.out.println("-----------------------------");
    }
}