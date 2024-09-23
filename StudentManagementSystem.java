import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    private List<Student> students = new ArrayList<>();

    // Adding a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Removing a student by his/her roll number
    public void removeStudent(String rollNumber) {
        students.removeIf(student -> student.getRollNumber().equals(rollNumber));
    }

    // Search for a student by his/her roll number
    public Student searchStudent(String rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber().equals(rollNumber)) {
                return student;
            }
        }
        return null;
    }

    // Display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // Edit an existing student's details
    public void editStudent(String rollNumber, String newName, String newGrade) {
        Student student = searchStudent(rollNumber);
        if (student != null) {
            student.setName(newName);
            student.setGrade(newGrade);
            System.out.println("Student details updated ");
        } else {
            System.out.println("Student not found.");
        }
    }

   
        public static void main(String[] args) {
            StudentManagementSystem sms = new StudentManagementSystem();
            Scanner scanner = new Scanner(System.in);
    
            while (true) {
                System.out.println("\nStudent Management System");
                System.out.println("1. Add Student");
                System.out.println("2. Remove Student");
                System.out.println("3. Search Student");
                System.out.println("4. Display All Students");
                System.out.println("5. Edit Student");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");
                
                int choice = scanner.nextInt();
                scanner.nextLine();  // consume newline
    
                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter roll number: ");
                        String rollNumber = scanner.nextLine();
                        System.out.print("Enter grade: ");
                        String grade = scanner.nextLine();
                        sms.addStudent(new Student(name, rollNumber, grade));
                        System.out.println("Student added successfully.");
                        break;
                    
                    case 2:
                        System.out.print("Enter roll number of student to remove: ");
                        String rollToRemove = scanner.nextLine();
                        sms.removeStudent(rollToRemove);
                        System.out.println("Student removed successfully.");
                        break;
    
                    case 3:
                        System.out.print("Enter roll number of student to search: ");
                        String rollToSearch = scanner.nextLine();
                        Student foundStudent = sms.searchStudent(rollToSearch);
                        if (foundStudent != null) {
                            System.out.println(foundStudent);
                        } else {
                            System.out.println("Student not found.");
                        }
                        break;
    
                    case 4:
                        sms.displayAllStudents();
                        break;
    
                    case 5:
                        System.out.print("Enter roll number of student to edit: ");
                        String rollToEdit = scanner.nextLine();
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new grade: ");
                        String newGrade = scanner.nextLine();
                        sms.editStudent(rollToEdit, newName, newGrade);
                        break;
    
                    case 6:
                        System.out.println("Exit the system.");
                        scanner.close();
                        return;
    
                    default:
                        System.out.println("not valid, Please try again.");
                }
            }
        }
    }
