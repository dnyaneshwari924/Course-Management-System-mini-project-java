
package coursemanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseManagementSystem {

    static ArrayList<Course> courses = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Enrollment> enrollments = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            try {

                System.out.println("\n=================================");
                System.out.println("     COURSE MANAGEMENT SYSTEM");
                System.out.println("=================================");

                System.out.println("1. Add Course");
                System.out.println("2. View Courses");
                System.out.println("3. Search Course");
                System.out.println("4. Update Course");
                System.out.println("5. Delete Course");
                System.out.println("6. Add Student");
                System.out.println("7. View Students");
                System.out.println("8. Enroll Student");
                System.out.println("9. View Enrollments");
                System.out.println("10. Exit");

                System.out.println("=================================");

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                case 1:
                    addCourse();
                    break;

                case 2:
                    viewCourses();
                    break;

                case 3:
                    searchCourse();
                    break;

                case 4:
                    updateCourse();
                    break;

                case 5:
                    deleteCourse();
                    break;

                case 6:
                    addStudent();
                    break;

                case 7:
                    viewStudents();
                    break;

                case 8:
                    enrollStudent();
                    break;

                case 9:
                    viewEnrollments();
                    break;

                case 10:
                    System.out.println("Thank you for using Course Management System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
                }

            } catch (Exception e) {

                System.out.println("Invalid input! Please enter a valid number.");
                sc.nextLine();
            }
        }
    }

    static void addCourse() {

        try {

            System.out.println("\n----- ADD COURSE -----");

            System.out.print("Enter Course ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            for (Course course : courses) {

                if (course.courseId == id) {

                    System.out.println("Course ID already exists!");
                    return;
                }
            }

            System.out.print("Enter Course Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Instructor Name: ");
            String instructor = sc.nextLine();

            System.out.print("Enter Duration in Months: ");
            int duration = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Fees: ");
            String feeInput = sc.nextLine();

            double fees = Double.parseDouble(feeInput);

            Course course = new Course(
                    id,
                    name,
                    instructor,
                    duration,
                    fees
            );

            courses.add(course);

            System.out.println("Course added successfully!");

        } catch (Exception e) {

            System.out.println("Invalid input! Course was not added.");
            sc.nextLine();
        }
    }

    static void viewCourses() {

        System.out.println("\n----- ALL COURSES -----");

        if (courses.isEmpty()) {

            System.out.println("No courses available.");

        } else {

            for (Course course : courses) {

                course.displayCourse();
            }
        }
    }

    static void searchCourse() {

        try {

            System.out.print("Enter Course ID: ");
            int id = sc.nextInt();

            boolean found = false;

            for (Course course : courses) {

                if (course.courseId == id) {

                    System.out.println("\nCourse Found:");
                    course.displayCourse();

                    found = true;
                    break;
                }
            }

            if (!found) {

                System.out.println("Course not found.");
            }

        } catch (Exception e) {

            System.out.println("Invalid Course ID!");
            sc.nextLine();
        }
    }

    static void updateCourse() {

        try {

            System.out.print("Enter Course ID to update: ");
            int id = sc.nextInt();
            sc.nextLine();

            for (Course course : courses) {

                if (course.courseId == id) {

                    System.out.print("Enter New Course Name: ");
                    course.courseName = sc.nextLine();

                    System.out.print("Enter New Instructor: ");
                    course.instructor = sc.nextLine();

                    System.out.print("Enter New Duration in Months: ");
                    course.duration = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Fees: ");
                    String feeInput = sc.nextLine();

                    course.fees = Double.parseDouble(feeInput);

                    System.out.println("Course updated successfully!");

                    return;
                }
            }

            System.out.println("Course not found.");

        } catch (Exception e) {

            System.out.println("Invalid input! Course was not updated.");
            sc.nextLine();
        }
    }

    static void deleteCourse() {

        try {

            System.out.print("Enter Course ID to delete: ");
            int id = sc.nextInt();

            for (int i = 0; i < courses.size(); i++) {

                if (courses.get(i).courseId == id) {

                    courses.remove(i);

                    System.out.println("Course deleted successfully!");

                    return;
                }
            }

            System.out.println("Course not found.");

        } catch (Exception e) {

            System.out.println("Invalid Course ID!");
            sc.nextLine();
        }
    }

    static void addStudent() {

        try {

            System.out.println("\n----- ADD STUDENT -----");

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            for (Student student : students) {

                if (student.studentId == id) {

                    System.out.println("Student ID already exists!");
                    return;
                }
            }

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            Student student = new Student(
                    id,
                    name,
                    email
            );

            students.add(student);

            System.out.println("Student added successfully!");

        } catch (Exception e) {

            System.out.println("Invalid input! Student was not added.");
            sc.nextLine();
        }
    }

    static void viewStudents() {

        System.out.println("\n----- ALL STUDENTS -----");

        if (students.isEmpty()) {

            System.out.println("No students available.");

        } else {

            for (Student student : students) {

                student.displayStudent();
            }
        }
    }

    static void enrollStudent() {

        try {

            System.out.println("\n----- ENROLL STUDENT -----");

            System.out.print("Enter Student ID: ");
            int studentId = sc.nextInt();

            System.out.print("Enter Course ID: ");
            int courseId = sc.nextInt();

            boolean studentFound = false;
            boolean courseFound = false;

            for (Student student : students) {

                if (student.studentId == studentId) {

                    studentFound = true;
                    break;
                }
            }

            for (Course course : courses) {

                if (course.courseId == courseId) {

                    courseFound = true;
                    break;
                }
            }

            if (!studentFound) {

                System.out.println("Student not found!");
                return;
            }

            if (!courseFound) {

                System.out.println("Course not found!");
                return;
            }

            Enrollment enrollment = new Enrollment(
                    studentId,
                    courseId
            );

            enrollments.add(enrollment);

            System.out.println("Student enrolled successfully!");

        } catch (Exception e) {

            System.out.println("Invalid input! Enrollment failed.");
            sc.nextLine();
        }
    }

    static void viewEnrollments() {

        System.out.println("\n----- ALL ENROLLMENTS -----");

        if (enrollments.isEmpty()) {

            System.out.println("No enrollments available.");

        } else {

            for (Enrollment enrollment : enrollments) {

                System.out.println("Student ID: " + enrollment.studentId);
                System.out.println("Course ID: " + enrollment.courseId);
                System.out.println("-----------------------------");
            }
        }
    }
}

