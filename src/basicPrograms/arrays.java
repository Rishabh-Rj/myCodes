//package basicPrograms;
//
//import java.util.Scanner;
//
//public class arrays {
//	public static void main(String[] args) {
//		int arr[]=new int[100];
//		System.out.println("Enter size of your array: ");
//		Scanner sc=new Scanner(System.in);
//		int size=sc.nextInt();
//		System.out.println("Enter the "+size+" elements of your arary");
//		for(int i=0;i<size;i++) {
//			arr[i]=sc.nextInt();
//		}
//		
//		
//		System.out.println("Enter by how much element you want to left rotate: ");
//	
//		int n=sc.nextInt();
//		
//		System.out.println("Array Before Rotation:");
//		for(int i=0;i<size;i++) {
//			System.out.print(arr[i] + " ");
//		}
//		
//		//printing array using for-each loop  
//		
//		System.out.println("Printing array using for each");
//		for(int i:arr)  {
//			 System.out.print(i + " ");
//		}
//		
//		
//	}
//
//}



package basicPrograms;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        
        System.out.println("Enter size of your array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        System.out.println("Enter the " + size + " elements of your array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter by how much element you want to left rotate:");

        int n = sc.nextInt();

        System.out.println("Array Before Rotation:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // Printing array using for-each loop
        System.out.println("\nPrinting array using for each:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); // Add this line to move to the next line after printing the array using for each
    }
}






