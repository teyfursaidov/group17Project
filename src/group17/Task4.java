package group17;

public class Task4 {

	public static void main(String[] args) {


		
		int[][] numbers= {
				{1, 2, 3, 4},
				{10, 21, 32, 43},
				{56, 66, 67, 99}
		};
		int sumEven=0;
		int sumOdd=0;
		
		for(int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				if (numbers[i][j]%2==0) {
					sumEven+=numbers[i][j];
				}
			}
		}
		
		System.out.println("Sum of the even numbers is: "+sumEven);
		
		
		for(int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				if (numbers[i][j]%2==1) {
					sumOdd+=numbers[i][j];
				}
			}
		}
		
		
		System.out.println("Sum of the odd numbers is: "+sumOdd);
		
		
		
		
		
		
		
		
		
		
	}

}
