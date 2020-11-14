package David.Airline;

public class Airline {

    public static void main(String[] args) {

        // passenger 1
        Person p1 = new Person();
        p1. setName("David");
        p1. setLastName("Garcia");
        p1. setAge(20);
        p1. setSex(true);
        p1. setBirthPlace("Denver");
        Ticket t1 = new Ticket();
        t1. settNum(4692);
        t1. setTime("11:45 AM");
        t1. setGate("24D");
        t1. setDelayed(false);
        t1. setCanceled(false);

        // passenger 2
        Person p2 = new Person();
        p2.setName("Laura");
        p2.setLastName("Gutierrez");
        p2.setBirthPlace("Cartago");
        p2. setAge(20);
        p2. setSex(false);
        Ticket t2 = new Ticket();
        t2. settNum(4260);
        t2. setTime("12:30 PM");
        t2. setGate("24D");
        t2. setDelayed(false);
        t2. setCanceled(true);

        // passenger 3
        Person p3 = new Person();
        p3. setName("Carlos");
        p3. setBirthPlace("Mendez R");
        p3. setAge(30);
        p3. setSex(true);
        p3. setBirthPlace("SJ");
        Ticket t3 = new Ticket();
        t3. settNum(4205);
        t3. setTime("1:00 PM");
        t3. setGate("5D");
        t3. setDelayed(true);
        t3. setCanceled(false);

        // print passenger full name

        p1. printFullInfo();
        t1. printTicket();
        System.out.println(); // visual spacer
        p2. printFullInfo();
        t2. printTicket();
        System.out.println(); // visual spacer
        p3. printFullInfo();
        t3. printTicket();


    }
}
