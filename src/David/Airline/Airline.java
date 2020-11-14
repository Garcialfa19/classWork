package David.Airline;

public class Airline {
    Person p1 = new Person();
    Person p2 = new Person();
    Person p3 = new Person();
    Ticket t1 = new Ticket();
    Ticket t2 = new Ticket();
    Ticket t3 = new Ticket();
    Flight f1 = new Flight();
    Flight f2 = new Flight();
    Flight f3 = new Flight();

    public static boolean rPassenger(Person p){
        boolean result = false;

        if(p. getAge()>50){
            result = true;
        }
        return result;
    }

    // get and set
    public Person getP1() {
        return p1;
    }

    public void setP1(Person p1) {
        this.p1 = p1;
    }

    public Person getP2() {
        return p2;
    }

    public void setP2(Person p2) {
        this.p2 = p2;
    }

    public Person getP3() {
        return p3;
    }

    public void setP3(Person p3) {
        this.p3 = p3;
    }
}
