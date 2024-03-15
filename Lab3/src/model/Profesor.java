package model;

public class Profesor extends Person {
    private String course;
    private int year;

    public Profesor() {
        course = "";
        year = 1;
    }

    public Profesor(String course, int year) {
        this.course = course;
        this.year = year;
    }

    public Profesor(String name, String phone_number, String email_address, String course, int year) {
        super(name, phone_number, email_address);
        this.course = course;
        this.year = year;
    }

    public Profesor(Person p, String course, int year) {
        super(p.getName(), p.getPhone_number(), p.getEmail_address());
        this.course = course;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return super.toString() + "\ncourse: " + course + "\nyear: " + year;
    }
}
