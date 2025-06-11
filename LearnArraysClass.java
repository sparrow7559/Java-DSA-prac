
import java.util.Arrays;

public class LearnArraysClass{
    public static void main(String[] args) {
        
        // int[] numbers= {1,2,3,4,5,6,7,8,9,10};
        // int index = Arrays.binarySearch(numbers, 4);
        // System.out.println("The index of element 4 is "+index);

        Integer[] numbers = {12,5,42,6,48,5,65,86,52,45,17};
        Arrays.sort(numbers);

        Arrays.fill(numbers,12);

        for(int i:numbers){
            System.out.println(i);
        }

    }
}