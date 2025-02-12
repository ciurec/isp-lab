package src.main.java.lab6.exec1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Create a Java program that simulates a simple student grade management system using a list and a custom class.
 * The system should be able to store a student's name, ID, and their grades for multiple subjects (use a HashMap<String, Integer>,
 * grade by subject name). It should also be able to perform the following operations:
 * Add a student to the list.
 * Add student grades.
 * Remove a student from the list.
 * Update a student's information.
 * Calculate the average grade of a student.
 * Display the list of students.
 * Add minimal unit tests for the first 4 operations.
 */
public class StudentManager {

    private List<Student> studentList;

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public void removeStudent(long studentId) {
        this.studentList.remove(this.studentList.stream().filter(student -> student.getId() == (studentId)).findFirst().orElse(null));
    }

    public void updateStudent(Student student) {
        this.studentList.add(student);
    }

    public float getAverageGrade() {
        return 2f;
    }

    public StudentManager(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public static void main(String[] args) {
        Student studentOne = new Student();
        studentOne.setId(1L);

        Student studentTwo = new Student();
        studentTwo.setId(2L);
        StudentManager studentManager = new StudentManager(new ArrayList<>(List.of(studentOne)));
        studentManager.addStudent(studentTwo);
        studentManager.getStudentList().forEach(s ->
                System.out.println(s.getId()));
        studentManager.removeStudent(2L);
        studentManager.getStudentList().forEach(s ->
                System.out.println(s.getId()));
    }
}

class Student {

    private String name;
    private long id;
    private HashMap<String, Integer> grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public HashMap<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(HashMap<String, Integer> grades) {
        this.grades = grades;
    }
}
