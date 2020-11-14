package David.Airline;

public class Person {
    // Properties (Global Variables)
    String name;
    String lastName;
    int age;
    Boolean sex;
    String birthPlace;
    Ticket ticket;

    // functionality methods
    public void printFullName() {

        System.out.println("Full Name: " + name + " " + lastName);
    }

    public void printFullInfo() {
        printFullName();
        System.out.println("Age: " + age + "\n" + "Sex: " + sex + "\n" + "Birth Place: " + birthPlace);
    }

    // gets and sets methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}

