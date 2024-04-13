package basicPrograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int rem,sum=0,n,temp;
		System.out.println("Enter the number: ");
		
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0) {    //manual reversal 
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
			
		}
		
		if(temp==sum)
			System.out.println("Entered number is a Palindrome");
		else
			System.out.println("Entered no is not a palindrome");
	}

}
