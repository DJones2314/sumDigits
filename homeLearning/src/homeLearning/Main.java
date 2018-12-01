package homeLearning;

public class Main {

	public static void main(String[] args) {
		
		int number = 125;
		
		System.out.println(sumDigits(number));

	}
	
	
	public static int sumDigits(int number) {
		
		int sum = 0;
		
		if(number <= 10) {
			return -1;
		} else {
			while(number > 0) {
			sum = (sum + (number%10));
			number = number/10;
			}
			
		}
		
		
		return sum;
	};

}
