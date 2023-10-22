package Lec_04;

public class Make_numer_digits {
	public static void main(String[] args) {
		int num = 12345;
		int rev = 0;
		int same = 0;
		int mult = 1;
		while (num > 0) {
			int digit = num % 10;
			same = same  + mult*digit;
			rev = rev * 10 + digit;
			System.out.println(digit);
			num = num / 10;
			mult = mult*10;
		}
		System.out.println(rev);
		System.out.println(same);
	}
}
