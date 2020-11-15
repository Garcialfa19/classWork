package David.Exam;

public class Medical {
    // variables
    boolean smoker;
    boolean disease;
    String bloodType;
    boolean covid;

    //functionality methods
    public void printMedical() {
        System.out.println("Medical info:");
        System.out.println("Smoker: " + smoker);
        System.out.println("Disease: " + disease);
        System.out.println("Blood Type: " + bloodType);
        System.out.println("Covid-19: " + covid);
    }

    // get and set
    public boolean isSmoker() {
        return smoker;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }

    public boolean isDisease() {
        return disease;
    }

    public void setDisease(boolean disease) {
        this.disease = disease;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public boolean isCovid() {
        return covid;
    }

    public void setCovid(boolean covid) {
        this.covid = covid;
    }

}
