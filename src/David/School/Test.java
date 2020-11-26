package David.School;

public class Test {
    Student student;
    Teacher teacher;
    int grade;
    String nameClass;
    int totalPoints;
    int pointsObtained;

    public Test(){
    }

    public Test(Teacher teacher, Student student, int grade, String nameClass, int totalPoints, int pointsObtained){
        this.student = student;
        this.teacher = teacher;
        this.grade = grade;
        this.totalPoints = totalPoints;
        this.pointsObtained = pointsObtained;
    }

    public Test(int grade, String nameClass, int totalPoints, int pointsObtained) {
        this.grade = grade;
        this.nameClass = nameClass;
        this.totalPoints = totalPoints;
        this.pointsObtained = pointsObtained;
    }

    public Test(String nameClass, int totalPoints) {
        this.nameClass = nameClass;
        this.totalPoints = totalPoints;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getPointsObtained() {
        return pointsObtained;
    }

    public void setPointsObtained(int pointsObtained) {
        this.pointsObtained = pointsObtained;
    }

    @Override
    public String toString() {
        return "Student: " + student +
                ", Teacher: " + teacher +
                ", Grade: " + grade +
                ", Name of Class: " + nameClass +
                ", Total of Points: " + totalPoints +
                ", Points Obtained: " + pointsObtained;
    }
}
