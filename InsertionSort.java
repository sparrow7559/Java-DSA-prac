import java.util.*;
public class InsertionSort{
    public static void main(String[] args) {
        int[] arr=new int[1000];
        Random rand = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=rand.nextInt(1000);
        }
        sort(arr);
        long start = System.currentTimeMillis();
        for(int n: arr){
            System.out.println(n);
        }
        long end = System.currentTimeMillis();

        System.out.println("Time Taken: "+(end-start)+"ms");

    }

    public static void sort(int[] arr) {
        for(int i =1;i<arr.length;i++){
            int key = arr[i];
            int j =i-1;

            while(j>=0 &&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        
    }
}