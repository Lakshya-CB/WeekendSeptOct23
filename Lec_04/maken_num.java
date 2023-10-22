package Lec_04;

import java.util.Scanner;

public class maken_num {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long num = scn.nextLong();
		long cnt = 1;
		long ans = 0;
		long mult = 1;
		while (cnt <= num) {
			long digit = scn.nextLong();
			
			ans = ans + digit * mult;
			System.out.println(ans + " = "+mult);
			
			mult = mult * 10;
			
			cnt = cnt + 1;
		}
		System.out.println(ans);
	}
}
