package David.Money2;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String nameL;
        int valueL;
        String nameH;
        int amount;
        int result;

        System.out.println("Welcome to David's Money Converter");
        System.out.println("Please enter The name of the currency with the lower value: ");
        nameL = s.next();
        System.out.println("Please enter the value of this currency with respect to the higher value currency: ");
        valueL = s.nextInt();
        System.out.println("Please enter the name of the currency with the higher value: ");
        nameH = s.next();
        System.out.println("Please enter the amount of " + nameL + " that you wish to convert");
        amount = s.nextInt();

        result = amount * valueL;
        System.out.println(result);



    }

}
