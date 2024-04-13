package basicPrograms;

import java.util.Scanner;

public class Fibonaaci {
	static int n1=0,n2=1;
	static int n3=0;
	//without recurson
//	public static void main(String[] args) {
		
//		int first=0;
//		int second=1;
//		int third;
//		System.out.println("Enter the size of the fibonaaci series: ");
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		System.out.print("Fibonaaci Series: "+first + " "+ second + " ");
//		for(int i =0;i<n-2;i++) {
//			third=first+second;
//			System.out.print(third+" ");
//			first=second;
//			second=third;
//			
//		}
	
				
		//with recurson 
	public static void main(String[] args) {
		System.out.println("Enter the size of the fibonaaci series: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("Fibonaaci Series: "+n1 + " "+ n2 + " ");
		
		printFibonaaci(n-2);
		
		
	}
	
	private static void printFibonaaci(int n) {
		// TODO Auto-generated method stub
		if(n>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
		    System.out.print(" "+n3);
		    printFibonaaci(n-1);
			
		
	}
				
	}

}
