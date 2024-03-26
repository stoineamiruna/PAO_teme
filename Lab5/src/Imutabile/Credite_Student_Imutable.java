package Imutabile;

public class Credite_Student_Imutable {
    private final int nr_credite;
    private final Student student;

    public Credite_Student_Imutable(int nr_credite, Student student) {
        this.nr_credite = nr_credite;
        this.student = new Student(student);
    }

    public int getNr_credite() {
        return nr_credite;
    }


    public Student getStudent() {
        return new Student(student);
    }
}
