package David.Merger;

import java.util.Arrays;

public class Array {
    int[] arr;

    public Array(){
    }

    public Array(int[] arr) {
        this.arr = arr;
    }

    public void printArr() {
        System.out.println(arr);
    }

    public void sortArray(){
        Arrays.sort(arr);
    }

    //getter and setter


    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "Array{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
