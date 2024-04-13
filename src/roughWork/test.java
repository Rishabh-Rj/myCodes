package roughWork;

import java.util.Scanner;

public class test{
	public static void main(String[] args) {
		
		System.out.println("Hi, Please enter a string: ");
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		String str2=sc.next();
		System.out.println("Str1: " + str);
		System.out.println("Str2: " + str2);
		
		Scanner sc2= new Scanner(str);
		String str3=sc2.next();
		System.out.println("Str3: " + str3);
		
		sc.close();
	
	}
}