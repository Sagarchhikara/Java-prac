package studentManager;

import java.util.*;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    // Add a student (ensuring unique ID - simplified)
    public boolean addStudent(Student student) {
        // Check if ID already exists
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                System.out.println("Student ID already exists!");
                return false;
            }
        }
        students.add(student);
        System.out.println("Student added successfully.");
        return true;
    }

    // Modify student details by ID
    public boolean modifyStudent(int id, String newName, int newAge, String newGrade) {
        Student student = findStudentById(id);
        if (student == null) {
            System.out.println("Student not found.");
            return false;
        }
        student.setName(newName);
        student.setAge(newAge);
        student.setGrade(newGrade);
        System.out.println("Student updated successfully.");
        return true;
    }

    // Delete student by ID
    public boolean deleteStudent(int id) {
        Student student = findStudentById(id);
        if (student == null) {
            System.out.println("Student not found.");
            return false;
        }
        students.remove(student);
        System.out.println("Student removed successfully.");
        return true;
    }

    // Display specific student by ID
    public void displayStudent(int id) {
        Student student = findStudentById(id);
        if (student == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println(student);
        }
    }

    // Display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("\n--- All Students ---");
            for (Student s : students) {
                System.out.println(s);
            }
            System.out.println("--------------------");
        }
    }

    // Helper method to find student by ID
    private Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
}