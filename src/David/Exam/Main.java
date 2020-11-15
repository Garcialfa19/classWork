package David.Exam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char Selection;
        Patient[] p = new Patient[10];
        Medical[] m = new Medical[p.length];
        int i;
        int t;

        for (i = 0; i < p.length; i++) {
            System.out.print("What is the patients id: ");
            t = in.nextInt();
            System.out.println("What do you want to do?");
            System.out.println("P = Enter Patient Info");
            System.out.println("M = Enter Medical Info");
            System.out.println("S = Show all info");
            System.out.println("R = Show possibility of reinfection");

            Selection = in.next().charAt(0);

            switch (Selection) {
                case 'P':
                    p[t] = new Patient();
                    System.out.print("Please enter the patients name: ");
                    p[t].setName(in.next());
                    System.out.print("Please enter the patients last name: ");
                    p[t].setLastName1(in.next());
                    System.out.print("Please enter the patients second last name: ");
                    p[t].setLastName2(in.next());
                    System.out.print("Please enter the patients age: ");
                    p[t].setAge(in.nextInt());
                    System.out.print("Please enter the patients sex: ");
                    p[t].setSex(in.next().charAt(0));
                    break;
                case 'M':
                    if (p[t].age == 0) {
                        System.out.println("Patient " + t + " does not exist");
                    } else {
                        m[t] = new Medical();
                        System.out.print("Is the patient a smoker: ");
                        m[t].setSmoker(in.nextBoolean());
                        System.out.print("Does the patient have any mayor disease: ");
                        m[t].setDisease(in.nextBoolean());
                        System.out.print("Patients blood type: ");
                        m[t].setBloodType(in.next());
                        System.out.print("Does the patient have covid-19: ");
                        m[t].setCovid(in.nextBoolean());
                    }
                    break;
                case 'S':
                    System.out.println(); // visual spacer
                    System.out.println("Patient " + t);
                    p[t].printPatient();
                    if (p[t].age > 50 || m[t].bloodType.equals("o-")) {
                        System.out.println("This patient has increased risk factors");
                    }
                    m[t].printMedical();
                    System.out.println(); // visual spacer
                    break;
                case 'R':
                    double reinfection = (p[t].age * 0.1);
                    System.out.println("This patients chance of reinfection is of: " + reinfection + "%");
                    break;
                default:
                    System.out.println("Invalid selection: " + Selection);
                    break;
            }
        }
    }
}
