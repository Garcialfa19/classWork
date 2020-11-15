package David.Exam;

public class Patient {
    // variables
    String name;
    String lastName1;
    String lastName2;
    int age;
    char sex;

    // functionality methods

    public void printPatient(){
        System.out.println("Patient info:");
        System.out.println("Name: " + name + " " + lastName1 + " " + lastName2);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
    }

    // get and set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
