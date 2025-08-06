import java.util.ArrayList;
import java.util.Scanner;
class Student {
    int id;
    String name;
    double marks;
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        int choice;
        do {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1.Add Student");
            System.out.println("2.View Students");
            System.out.println("3.Update Student");
            System.out.println("4.Delete Student");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if (choice == 1) {          
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine(); 
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Marks: ");
                double marks = sc.nextDouble();
                Student s = new Student(id, name, marks);
                studentList.add(s);
                System.out.println("Student added!");
            } else if (choice == 2) {
                if (studentList.isEmpty()) {
                    System.out.println("No students to display.");
                } else {
                    System.out.println("List of Students:");
                    for (Student s : studentList) {
                        s.display();
                    }
                }

            } else if (choice == 3) {
                System.out.print("Enter ID of student to update: ");
                int id = sc.nextInt();
                boolean found = false;
                for (Student s : studentList) {
                    if (s.id == id) {
                        sc.nextLine();
                        System.out.print("Enter new name: ");
                        s.name = sc.nextLine();
                        System.out.print("Enter new marks: ");
                        s.marks = sc.nextDouble();
                        System.out.println("Student updated!");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Student not found.");
                }
            } else if (choice == 4) {
                System.out.print("Enter ID of student to delete: ");
                int id = sc.nextInt();
                boolean removed = false;
                for (int i = 0; i < studentList.size(); i++) {
                    if (studentList.get(i).id == id) {
                        studentList.remove(i);
                        System.out.println("Student deleted.");
                        removed = true;
                        break;
                    }
                }
                if (!removed) {
                    System.out.println("Student not found.");
                }
            } else if (choice == 5) {
                System.out.println("Exiting program...");
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
        sc.close();
    }
}
