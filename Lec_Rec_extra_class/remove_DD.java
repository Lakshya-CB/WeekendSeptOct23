package Lec_Rec_extra_class;

import java.util.Scanner;

public class remove_DD {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		removeDup(scn.next());
	}

	public static void removeDup(String str) {
//		String ans = "";
		StringBuilder SB = new StringBuilder();
		char prev = '0';
		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
//			System.out.println(curr+ "  "+prev);
			if (prev != curr) {
//				ans = ans + curr;
				SB.append(curr);
			}
			prev = curr;
		}
		System.out.println(SB);
	}
}
