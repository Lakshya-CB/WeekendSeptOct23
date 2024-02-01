package Lec_Rec_extra_class;

import java.util.Scanner;

public class replace_all_pi {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			t--;
			solve2(scn.next(), "");
		}
	}
	public static void solve2(String str, String ans) {
		if(str.isEmpty()) {
			System.out.println(ans);
			return;
		}
		if(str.startsWith("pi")) {
			solve2(str.substring(2), ans+3.14);
		}else {
			solve(str.substring(1), ans+str.charAt(0));
		}
	}
	public static void solve(String str, String ans) {
		int f = str.indexOf("pi");
		if (f == -1) {
			System.out.println(ans + str);
			return;
		}
		String remain = str.substring(f + 2);
		solve(remain, ans + str.substring(0, f) + 3.14);
	}
}
