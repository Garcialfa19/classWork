package David.School;

public class GradeSystem {
    int maxRegistries = 100;
    Test[] tests = new Test[maxRegistries];
    int count;

    public GradeSystem(){
    }

    //deletes last entry
    public boolean deleteTs(){
        boolean result = false;
        if (count != 0){
            tests[count-1]=null;
            count--;
            result = true;
        }
        return result;
    }

    // add a test to the array
    public boolean addTs(Test ts){
        boolean result = false;
        if(count < maxRegistries){  // if the array has space
            tests[count]= ts;
            count++;
            result = true;
        }
        return result;
    }

    // print tests
    public void printTs(){
        for(int i = 0; i < count; i++){
            if(tests[i] != null)
                System.out.println(tests[i].toString());
        }
    }

    // calculate average
    public float averageGrades(){
        float returned=0f;
        return returned;
    }

    public int getMaxRegistries() {
        return maxRegistries;
    }

    public void setMaxRegistries(int maxRegistries) {
        this.maxRegistries = maxRegistries;
    }

    public Test[] getTests() {
        return tests;
    }

    public void setTests(Test[] tests) {
        this.tests = tests;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
