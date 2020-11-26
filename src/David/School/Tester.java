package David.School;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        GradeSystem system = new GradeSystem();
        Scanner s = new Scanner(System.in);
        char operation;

        while (true) {
            System.out.println("Please select the action that you wish to perform");
            System.out.println("A: Add a new entry");
            System.out.println("D: Delete previous entry");
            System.out.println("P: Print all entries");
            operation = s.next().charAt(0);

            switch (operation) {
                // Add a new test
                case 'A':
                    // student info
                    System.out.println("Enter the students name:");
                    String name = s.next();
                    System.out.println("Enter the students last name:");
                    String lastName = s.next();
                    System.out.println("Enter the students id number:");
                    int id = s.nextInt();
                    Student student = new Student(name, lastName, id); // creates student

                    // teacher info
                    System.out.println("Enter the teachers name:");
                    String tName = s.next();
                    System.out.println("Enter the teachers last name:");
                    String tLastName = s.next();
                    System.out.println("Enter the teachers number:");
                    int tnum = s.nextInt();
                    Teacher teacher = new Teacher(tName, tLastName, tnum); // creates teacher

                    //test info
                    System.out.println("Enter the name of the class");
                    String nameClass = s.next();
                    System.out.println("Enter the grade:");
                    int grade = s.nextInt();
                    System.out.println("Enter the total amount of points possible");
                    int totalPoints = s.nextInt();
                    System.out.println("Enter points obtained:");
                    int pointsObtained = s.nextInt();
                    Test t = new Test(teacher, student, grade, nameClass, totalPoints, pointsObtained); // creates test

                    // adds test
                    system.addTs(t);
                    break;

                // Delete last entry
                case 'D':
                    system.deleteTs();
                    break;

                // Print all tests
                case 'P':
                    system.printTs();
                    break;
            }
        }
    }
}
