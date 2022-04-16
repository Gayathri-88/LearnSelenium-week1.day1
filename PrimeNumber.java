package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int a = 13;
		boolean flag = false;
		for (int i = 2; i <= 6; i++) {
			int remainder = a % i;
			if (remainder == 0) {
				flag = true;
			}

		}
		if (flag == true) {

			System.out.println("Not a prime number");
		}

		else {
			System.out.println("Prime number");
		}

	}
}
