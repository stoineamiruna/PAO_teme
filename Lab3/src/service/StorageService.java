package service;
import model.Profesor;
import model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StorageService {
    private List<Student> students = new ArrayList<>();
    private List<Profesor> professors = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfesor(Profesor profesor) {
        professors.add(profesor);
    }

    public String read(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student.toString();
            }
        }
        for (Profesor profesor : professors) {
            if (profesor.getName().equals(name)) {
                return profesor.toString();
            }
        }
        return "Not existing";
    }

}
