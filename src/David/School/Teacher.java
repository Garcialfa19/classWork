package David.School;

public class Teacher {
    String tName;
    String tLastName;
    int tnum;

    public Teacher(){
    }

    public Teacher(String tName, String tLastName, int tnum){
        this.tName = tName;
        this.tLastName = tLastName;
        this. tnum = tnum;
    }

    public void showData(){
        System.out.println(tName + " " + tLastName + " " + tnum);}

    // getter and setter


    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettLastName() {
        return tLastName;
    }

    public void settLastName(String tLastName) {
        this.tLastName = tLastName;
    }

    public int getTnum() {
        return tnum;
    }

    public void setTnum(int tnum) {
        this.tnum = tnum;
    }

    @Override
    public String toString() {
        return "Teachers Name: " + tName +
                ", Teachers Last Name: " + tLastName +
                ", Teachers number: " + tnum;

    }
}
