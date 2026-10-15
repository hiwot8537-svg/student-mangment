
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        students.add("101, Abebe, 80");
        students.add("102, Hana, 75");
        students.add("103, Dawit, 40");

        int choice;

        do {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. View Students");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAll Students:");
                    for (String student : students) {
                        System.out.println(student);
                    }
                    break;

                case 2:
                    System.out.print("Enter Student ID: ");
                    String searchId = input.next();

                    boolean found = false;

                    for (String student : students) {
                        if (student.startsWith(searchId + ",")) {
                            System.out.println("Student Found: " + student);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    String deleteId = input.next();

                    boolean deleted = false;

                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).startsWith(deleteId + ",")) {
                            students.remove(i);
                            deleted = true;
                            break;
                        }
                    }

                    if (deleted) {
                        System.out.println("Student Deleted Successfully!");
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        input.close();
    }
}

