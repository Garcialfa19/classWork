package David.Airline;

public class Tester {
    public static void main(String[] args) {

        Airline a = new Airline();

        // passenger 1
        //personal info
        a.getP1().setName("David");
        a.getP1().setLastName("Garcia");
        a.getP1().setAge(20);
        a.getP1().setSex(true);
        a.getP1().setBirthPlace("Denver");
        // ticket info
        a.t1.settNum(4692);
        a.t1.setType("First");
        a.t1.setSeat("24D");
        a.t1.setDelayed(false);
        a.t1.setCanceled(false);
        // flight info
        a.f1.setfNum(1236);
        a.f1.setTime("12:45 PM");
        a.f1.setGate("D25");
        a.f1.setdDate("24/12/2020");
        a.f1.setDestination("MUC Munich");

        // passenger 2
        // personal info
        a.p2.setName("Laura");
        a.p2.setLastName("Gutierrez");
        a.p2.setBirthPlace("Cartago");
        a.p2.setAge(20);
        a.p2.setSex(false);
        //ticket info
        a.t2.settNum(4260);
        a.t2.setType("Business");
        a.t2.setSeat("24D");
        a.t2.setDelayed(false);
        a.t2.setCanceled(true);
        // flight info
        a.f2.setfNum(1237);
        a.f2.setTime("1:00 PM");
        a.f2.setGate("D27");
        a.f2.setdDate("02/09/2020");
        a.f2.setDestination("MCO Orlando");

        // passenger 3
        //personal info
        a.p3.setName("Carlos");
        a.p3.setBirthPlace("Mendez R");
        a.p3.setAge(30);
        a.p3.setSex(true);
        a.p3.setBirthPlace("SJ");
        //ticket info
        a.t3.settNum(4205);
        a.t3.setType("Tourist");
        a.t3.setSeat("5D");
        a.t3.setDelayed(true);
        a.t3.setCanceled(false);
        // flight info
        a.f3.setfNum(1235);
        a.f3.setTime("4:00 PM");
        a.f3.setGate("D22");
        a.f3.setdDate("19/02/2020");
        a.f3.setDestination("JFK New York");


        // print passenger full info
        a.p1.printFullInfo();
        a.t1.printTicket();
        a.f1.printFlight();
        System.out.println(); // visual spacer
        a.p2.printFullInfo();
        a.t2.printTicket();
        a.f2.printFlight();
        System.out.println(); // visual spacer
        a.p3.printFullInfo();
        a.t3.printTicket();
        a.f3.printFlight();

        // Risky Passenger
        boolean value = a.rPassenger(a.p1);
        if (value == true) {
            System.out.println(a.p1.getName() + " is a risky passenger");
        } else {
            System.out.println(a.p1.getName() + " is not a risky passenger");
        }
    }
}
