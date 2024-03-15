package model;

public class Student extends Person {
    private int student_number;
    private double average_mark;
    private int class_number;

    public Student() {
        this.student_number = 0;
        this.average_mark = 0;
        this.class_number = 0;
    }

    public Student(int student_number, double average_mark, int class_number) {
        this.student_number = student_number;
        this.average_mark = average_mark;
        this.class_number = class_number;
    }

    public Student(String name, String phone_number, String email_address, int student_number, double average_mark, int class_number) {
        super(name, phone_number, email_address);
        this.student_number = student_number;
        this.average_mark = average_mark;
        this.class_number = class_number;
    }

    public Student(Person p, int student_number, double average_mark, int class_number) {
        super(p.getName(), p.getPhone_number(), p.getEmail_address());
        this.student_number = student_number;
        this.average_mark = average_mark;
        this.class_number = class_number;
    }

    public double getAverage_mark() {
        return average_mark;
    }

    public int getClass_number() {
        return class_number;
    }

    public int getStudent_number() {
        return student_number;
    }

    public void setAverage_mark(double average_mark) {
        this.average_mark = average_mark;
    }

    public void setClass_number(int class_number) {
        this.class_number = class_number;
    }

    public void setStudent_number(int student_number) {
        this.student_number = student_number;
    }

    public String toString() {
        return super.toString() + "\nstudent number: " + student_number + "\naverage mark: " + average_mark + "\nclass: " + class_number;
    }
}
