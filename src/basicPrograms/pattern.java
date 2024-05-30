package basicPrograms;

import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		System.out.println("hello there");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for star");
		int n = sc.nextInt();
		
		System.out.println("Star Pattern below");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
