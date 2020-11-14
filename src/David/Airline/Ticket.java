package David.Airline;

public class Ticket {
    //Properties
    int tNum;
    String type;
    String seat;
    boolean delayed;
    boolean canceled;

    // functionality methods
    public void printTicket() {
        System.out.println("Ticket number: " + tNum);
        System.out.println("Departure time: " + type);
        System.out.println("Gate number: " + seat);
        System.out.println("Delayed: " + delayed);
        System.out.println("Canceled: " + canceled);
    }

    public int gettNum() {
        return tNum;
    }

    public void settNum(int tNum) {
        this.tNum = tNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
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
