package arrays;

public class Array_leftRotate {

		public static void main(String[] args) {  

	    //Initialize array  
	    int [] arr = new int [] {1, 2, 3, 4, 5};  
	    //n determine the number of times an array should be rotated  
	    int rotate = 3;  
	    //Displays original array  
	    System.out.println("Original array: ");  
	    for (int i = 0; i < arr.length; i++) {  
	        System.out.print(arr[i] + " ");  
	    }  
	    System.out.println();  
	    leftRotate(arr,arr.length,rotate );
	    System.out.println("Rotated Array: ");  
	    for(int i = 0; i< arr.length; i++){  
	        System.out.print(arr[i] + " ");  
	    }  
	    
	    //enhance for loop or for-Each loop
	    System.out.println();
	    for(int i:arr){  
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
	    
	    static void leftRotate(int[] arr, int n, int r) {    
	        
	        reverse(arr,0,r-1);
	        reverse(arr,r,n-1);
	        reverse(arr,0,n-1);
	    }
	   
	}


