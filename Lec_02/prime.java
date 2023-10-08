package Lec_02;

public class prime {
	public static void main(String[] args) {
		int num = 6;
		int numOfFac = 0;
		int divisor = 1;
		while (divisor <= num) {
//			System.out.println(divisor);
			int Rem = num % divisor;
			System.out.println(divisor + " - " + Rem);
			if (Rem == 0) {
				numOfFac = numOfFac + 1;
			}
			divisor = divisor + 1;
		}
		System.out.println(numOfFac);
		if (numOfFac == 2) {
			System.out.println("Prime");

		} else {
			System.out.println("Not Prime");
		}
	}
}
