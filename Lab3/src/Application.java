import model.Profesor;
import model.Student;
import service.StorageService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StorageService storageService = new StorageService();

        while (true) {
            System.out.println("Available commands:");
            System.out.println("create");
            System.out.println("read");
            System.out.println("update");
            System.out.println("delete");
            System.out.println("quit");

            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("quit")) {
                break;
            }

            switch (command) {
                case "create":
                    System.out.print("Enter type of person (student/profesor): ");
                    String personType = scanner.nextLine();

                    System.out.print("name: ");
                    String name = scanner.nextLine();
                    System.out.print("phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("email: ");
                    String email = scanner.nextLine();

                    if (personType.equals("student")) {
                        System.out.print("student number: ");
                        int studentNumber = scanner.nextInt();
                        System.out.print("average mark: ");
                        double averageMark = scanner.nextDouble();
                        System.out.print("class: ");
                        int classNumber = scanner.nextInt();
                        scanner.nextLine();
                        storageService.addStudent(new Student(name, phoneNumber, email, studentNumber, averageMark, classNumber));
                    } else if (personType.equals("profesor")) {
                        System.out.print("course: ");
                        String course = scanner.nextLine();
                        System.out.print("year: ");
                        int year = scanner.nextInt();
                        scanner.nextLine();
                        storageService.addProfesor(new Profesor(name, phoneNumber, email, course, year));
                    }
                    break;
                case "read":
                    System.out.print("Name: ");
                    String personName = scanner.nextLine();
                    String result = storageService.read(personName);
                    System.out.println(result);
                    break;

                default:
                    System.out.println("Invalid command");
            }
        }
    }
}
