package Imutabile;

public class Student {
    private String nume;
    private String prenume;
    private int varsta;


    public Student(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public Student(Student student){
        this.nume = student.getNume();
        this.prenume = student.getPrenume();
        this.varsta = student.getVarsta();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", prenume=" + prenume +
                ", varsta='" + varsta + '\'' +
                '}';
    }
}
