package Lec_05;

import java.util.Scanner;

public class chewbacca {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long num = scn.nextLong();
		long ans = 0;
		long mult = 1;
		while (num > 0) {
			long digit = num % 10;
			// System.out.println(digit);
			if (num != 9 && digit >= 5) {
				digit = 9 - digit;
			}
			ans = ans + digit * mult;
			num = num / 10;
			mult = mult * 10;
		}
		System.out.println(ans);
	}
}
