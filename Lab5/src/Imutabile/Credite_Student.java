package Imutabile;

public class Credite_Student {
    private int nr_credite;
    private Student student;

    public Credite_Student(int nr_credite, Student student) {
        this.nr_credite = nr_credite;
        this.student = student;
    }

    public int getNr_credite() {
        return nr_credite;
    }

    public void setNr_credite(int nr_credite) {
        this.nr_credite = nr_credite;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
