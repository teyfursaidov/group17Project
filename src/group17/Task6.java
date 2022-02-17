package group17;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter an integer to check if it`s Prime or not");
		int input=scan.nextInt();
		boolean flag=false;
		for(int i=2; i<=input/2; ++i) {
			if(input%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println(input+" is a Prime number.");
		else
			System.out.println(input+" is not a Prime number.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
