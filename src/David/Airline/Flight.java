package David.Airline;

import java.util.Date;

public class Flight {
    // properties
    int fNum;
    String time;
    String gate;
    String  dDate;
    String Destination;

    // functionality methods
    public void printFlight(){
        System.out.println("Ticket number: " + fNum);
        System.out.println("Departure time: " + time);
        System.out.println("Gate number: " + gate);
        System.out.println("Date: " + dDate);
        System.out.println("Destination: " + Destination);

    }

    public int getfNum() {
        return fNum;
    }

    public void setfNum(int fNum) {
        this.fNum = fNum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getdDate() {
        return dDate;
    }

    public void setdDate(String dDate) {
        this.dDate = dDate;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }
}
