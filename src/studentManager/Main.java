package studentManager;

import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            StudentManager manager = new StudentManager();
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n=== Student Management System ===");
                System.out.println("1. Add Student");
                System.out.println("2. Modify Student");
                System.out.println("3. Drop Student");
                System.out.println("4. Display Specific Student");
                System.out.println("5. Display All Students");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter Student ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Grade: ");
                        String grade = scanner.nextLine();
                        Student s = new Student(id, name, age, grade);
                        manager.addStudent(s);
                        break;

                    case 2:
                        System.out.print("Enter Student ID to modify: ");
                        int modifyId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter New Name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter New Age: ");
                        int newAge = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter New Grade: ");
                        String newGrade = scanner.nextLine();
                        manager.modifyStudent(modifyId, newName, newAge, newGrade);
                        break;

                    case 3:
                        System.out.print("Enter Student ID to drop: ");
                        int dropId = scanner.nextInt();
                        manager.deleteStudent(dropId);
                        break;

                    case 4:
                        System.out.print("Enter Student ID to display: ");
                        int displayId = scanner.nextInt();
                        manager.displayStudent(displayId);
                        break;

                    case 5:
                        manager.displayAllStudents();
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } while (choice != 6);

            scanner.close();
        }
    }

