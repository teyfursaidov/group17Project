package group17;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		
		/*
		 * Create an array on int values using a scanner and calculate the sum of all stored elements in that array.
		 */
		System.out.println("Enter the required sizeof the array: ");
			 Scanner scan=new Scanner(System.in);
			 int size=scan.nextInt();
			 int myArray[]=new int[size];
			 int sum=0;
			 
			 System.out.println("Enter the elements of the array one by one ");
		
			 for (int i=0; i<size; i++) {
				 myArray[i]=scan.nextInt();
				 sum=sum+myArray[i];
			 }
			 System.out.print("Elements of the array are: [ ");
			 for (int elements:myArray) {
				 System.out.print(elements+" ");
			 }
			 System.out.println("]");
			 System.out.println("");
			 System.out.println("Sum of the elements of the array: "+sum);
		
	
	}

}
