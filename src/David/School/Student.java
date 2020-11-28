package David.School;

public class Student {
    Parent father;
    Parent mother;
    String name;
    String lastName;
    int id;

    public Student(){
    }

    public Student(Parent father, Parent mother, String name, String lastName, int id) {
        this.father = father;
        this.mother = mother;
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    // getter and setter

    public Parent getFather() {
        return father;
    }

    public void setFather(Parent father) {
        this.father = father;
    }

    public Parent getMother() {
        return mother;
    }

    public void setMother(Parent mother) {
        this.mother = mother;
    }

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
    return "father: " + father +
            ", mother: " + mother +
            ", Student Name: " + name +
            ", lastName: " + lastName +
            ", id: " + id;
    }
}
