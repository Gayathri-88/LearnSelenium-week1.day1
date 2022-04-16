package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {

		int firstNum = 0;
		int secondNum = 1;
		int sum;
		System.out.println(firstNum);
		for (int i = 1; i < 7; i++) {
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.println(sum);
		}
	}
}
