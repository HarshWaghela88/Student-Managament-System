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
        int choice;
        do {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            // placeholder for operations
            if (choice == 1) {
                System.out.println("Add Student feature not implemented yet.");
            } else if (choice == 2) {
                System.out.println("View Students feature not implemented yet.");
            } else if (choice == 3) {
                System.out.println("Update Student feature not implemented yet.");
            } else if (choice == 4) {
                System.out.println("Delete Student feature not implemented yet.");
            } else if (choice == 5) {
                System.out.println("Exiting program...");
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
        sc.close();
    }
}
