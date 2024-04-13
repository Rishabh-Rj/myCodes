package first;

import java.util.Scanner;

public class hello {
	

		// TODO Auto-generated method stub
//		public static void main(String[] args) {
//			System.out.println("Hello Rj here2");
//			Scanner sc= new Scanner(System.in);
//			String rj= sc.nextLine();
//			System.out.println(rj);
//		}
		
	
	
	 //basic input output 
//		public static void main(String[] args) {
//			System.out.println("Enter your favourite string: ");
//			Scanner sc= new Scanner(System.in);
//			String rj1= sc.nextLine();
//			System.out.println("Here is your entered string: "+rj1);
//		}
	
	
	//array -average of marks
	public static void main(String[] args) {
		System.out.println("Enter the number of students: ");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter the marks of all "+n+" students now");
		int marks[]= new int[n];
		
		for(int i=0; i<n;i++) {
			marks[i]=sc.nextInt();
			
		}
		
		int averageMarks=0;
		for(int i=0;i<n;i++) {
			averageMarks+=marks[i];
		}
		
		averageMarks/=n;
		System.out.println("Average marks of all students is : "+averageMarks);
		
	}

}
