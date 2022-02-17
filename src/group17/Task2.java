package group17;

public class Task2 {

	public static void main(String[] args) {


	
		int [][] numbers= {
				{10, 20, 30, 40},
				{100, 200, 300, 400},
				{1000, 2000, 3000, 4000}
		};
		
		int sum=0;
		for (int[] innerArray:numbers) {
			for (int i: innerArray) {
				sum+=i;
			}
		}
		
		System.out.println("The sum of all numbers is: "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
