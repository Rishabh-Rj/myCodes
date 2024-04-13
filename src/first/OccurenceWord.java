package first;

import java.util.Scanner;

public class OccurenceWord{
	public static void main(String[] args) {
	System.out.println("Enter string: ");
	Scanner sc= new Scanner(System.in);
	String str= sc.nextLine();
	
	//Below is split method like python 
	String[] str2=str.split("\\s+");    
						
	int count=0;
	for(String i: str2) {
		if (i.equals("water")) {
			count++;
		}			
	}
	System.out.println("Occurence of 'water' in sentence= "+count);
	sc.close();
	}
}









//Below is original method , we use input line as source of next scannner


//package first;
//
//
//import java.util.Scanner;
//
//public class OccurenceWord {
//	public static void main(String[] args) {
//		System.out.println("Enter a sentence");
//		Scanner sc= new Scanner(System.in);
//		String sentence= sc.nextLine();
//		
//		Scanner sc2= new Scanner(sentence);
//		int count=0;
//		
//		while(sc2.hasNext()) {
//			String word= sc2.next();
//			if(word.equalsIgnoreCase("water")){
//				count++;
//			}
//		}
//		
//		sc.close();
//		sc2.close();
//		System.out.println("Occurence of 'water' in sentence= "+count);
//		
//	}
//	}


