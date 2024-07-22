package arrays;
import java.util.*;
public class Array_leftRotate {

		public static void main(String[] args) {  
		Scanner sc= new Scanner(System.in);
	    int [] nums = new int [] {1,2,3,4};
		int [] nums2 = new int [] {-1,-100,3,99};

		int n = nums.length;
		int k = sc.nextInt() % n;



		//left rotate
			reverse(nums,0,k-1);
			reverse(nums,k,n-1);
			reverse(nums,0,n-1);

			System.out.println("Left Rotated Array: ");
			for(int i:nums){
				System.out.print(i + " ");
			}

		//right rotate
			reverse(nums2,0,n-1);
			reverse(nums2,0,k-1);
			reverse(nums2,k,n-1);

			System.out.println("");
			System.out.println("Right Rotated Array: ");
			for(int i:nums2){
				System.out.print(i + " ");
			}

		}



	    static void reverse(int[] arr, int i, int j) {
	        while(i<j) {
	            int temp=arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            i++;
	            j--;
	        }
	    }
	}


