package basicPrograms;

import java.util.Scanner;

class switchCase{
	public static void main(String[] args) {
		boolean repeat= true;
		Scanner sc= new Scanner(System.in);
		while(repeat) {
			
		
		System.out.println("Hey There, Choose from below option");
		System.out.println("1. Addition");
		System.out.println("2. Multiplication");
		
		int option = sc.nextInt();
		System.out.println("enter the two numbers");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		
		switch(option) {
		case 1: System.out.println("Addition of "+n1+" and "+n2+" = "+(n1+n2)); 
				break;
				
		case 2: System.out.println("Multiplication  of "+n1+" and "+n2+" = "+(n1*n2));
				break;
		default: System.out.println("Invalid Operation");
				break;
		
				
		}
		
		System.out.println("Do you want to perform operation again(yes/no");
		String choice = sc.next();
		repeat= choice.equalsIgnoreCase("yes");
		
		
	}
}
	}