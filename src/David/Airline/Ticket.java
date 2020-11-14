package David.Airline;

public class Ticket {
    //Properties
    int tNum;
    String time;
    String gate;
    boolean delayed;
    boolean canceled;

    // functionality methods
    public void printTicket(){
        System.out.println("Ticket number: " + tNum);
        System.out.println("Departure time: " + time);
        System.out.println("Gate number: " + gate);
        System.out.println("Delayed: " + delayed);
        System.out.println("Canceled: " + canceled);
    }

    public int gettNum() {
        return tNum;
    }

    public void settNum(int tNum) {
        this.tNum = tNum;
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

    public boolean isDelayed() {
        return delayed;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }
}
