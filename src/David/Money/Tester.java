package David.Money;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        // establish Currency
        Currency cColon = new Currency("Colon", 1);
        Currency cDollar = new Currency("Dollar", 500);
        Currency cEuro = new Currency("Euro", 750);

        //start
        Scanner s = new Scanner(System.in);
        MoneyConv mon = new MoneyConv(cColon, cDollar, cEuro);

        while (true) {
            System.out.println("Please enter the Currency of Origin 1=Colon  2=Dollar  3=Euro");
            int numCurrency = s.nextInt();
            System.out.println("Please enter the Target Currency 1=Colon  2=Dollar  3=Euro");
            int numTarget = s.nextInt();
            System.out.println("Please enter the amount: ");
            int amount = s.nextInt();

            if (numCurrency == 1) { //colon
                if (numTarget == 1) { //colon
                    System.out.println("The equivalent value is: " + mon.convert(cColon, cColon, amount));
                } else if (numTarget == 2) { // Dollar
                    System.out.println("The equivalent value is: " + mon.convert(cColon, cDollar, amount));
                } else { // euro
                    System.out.println("The equivalent value is: " + mon.convert(cColon, cEuro, amount));
                }
            } else if (numCurrency == 2) { // dollar
                if (numTarget == 1) { //colon
                    System.out.println("The equivalent value is: " + mon.convert(cDollar, cColon, amount));
                } else if (numTarget == 2) { // Dollar
                    System.out.println("The equivalent value is: " + mon.convert(cDollar, cDollar, amount));
                } else { // euro
                    System.out.println("The equivalent value is: " + mon.convert(cDollar, cEuro, amount));
                }
            } else if (numCurrency ==3){ // euro
                if (numTarget == 1) { //colon
                    System.out.println("The equivalent value is: " + mon.convert(cEuro, cColon, amount));
                } else if (numTarget == 2) { // Dollar
                    System.out.println("The equivalent value is: " + mon.convert(cEuro, cDollar, amount));
                } else { // euro
                    System.out.println("The equivalent value is: " + mon.convert(cEuro, cEuro, amount));
                }
            }
        }
    }
}
