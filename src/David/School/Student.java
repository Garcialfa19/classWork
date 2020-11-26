package David.School;

public class Student {
    String name;
    String lastName;
    int id;

    public Student(){
    }

    public Student(String name, String lastName, int id){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }


    public void showData(){
        System.out.println(name + " " + lastName + " " + id);
    }

    // gets and sets

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Last Name: " + lastName +
                ", Id: " + id;
    }
}
