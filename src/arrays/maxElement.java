package arrays;

import java.util.Arrays;

public class maxElement {
    public static void main(String[] args) {
        int arr[]= new int[]{4,1,44,2};
        Arrays.sort(arr);
        System.out.println("Max element: "+ arr[arr.length-1]);
    }
}
