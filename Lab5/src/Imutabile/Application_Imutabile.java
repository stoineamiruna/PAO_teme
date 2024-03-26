package Imutabile;

public class Application_Imutabile {
    public static void main(String[] args) {
        Student student = new Student("Popescu", "Andrei", 20);

        Credite_Student crediteStudent = new Credite_Student(240, student);
        System.out.println("Credite_Student mutable: " + crediteStudent.getStudent());

        Credite_Student_Imutable credite_student_imutable = new Credite_Student_Imutable(300, student);

        //schimb numele florii folosita de bouquet si bouquetImmutable
        student.setNume("Georgescu");

        //bouquet a preluat numele schimbat
        System.out.println("Credite_Student mutable: " +crediteStudent.getStudent());

        //nu are setteri
        //bouquetImmutable nu a luat noul nume. A ramas margareta
        Student student2 = credite_student_imutable.getStudent();
        Student student3 = credite_student_imutable.getStudent();
        System.out.println("Credite_Student imutable: " + student2);
        System.out.println("Credite_Student imutable: " + student3);

    }
}
