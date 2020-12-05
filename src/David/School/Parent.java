package David.School;

public class Parent {
    String pName;
    String pLastName;

    public Parent() {
    }

    public Parent(String pName, String pLastName) {
        this.pName = pName;
        this.pLastName = pLastName;
    }

    public void printParent() {
        System.out.println(pName + " " + pLastName);
    }

    //getter and setter


    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpLastName() {
        return pLastName;
    }

    public void setpLastName(String pLastName) {
        this.pLastName = pLastName;
    }


    @Override
    public String toString() {
        return "Name: " + pName +
                ", Last Name: " + pLastName;
    }
}
