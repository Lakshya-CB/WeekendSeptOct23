package Lec_March_extra;

import java.util.Scanner;

public class obidient_String {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str= scn.next();
		if(str.isEmpty()) {
			System.out.println("true");
			return;
		}
		System.out.println(solve(str,"a"));
	}

	public static boolean solve(String str, String path) {
		if (!str.startsWith(path)) {
			return false;
		}
		if (str.equals(path)) {
			return true;
		}
		if (path.endsWith("a")) {
			boolean sp1 = solve(str, path + "a");
			boolean sp2 = solve(str, path + "bb");
			return sp1 || sp2;
		} else if (path.endsWith("bb")) {
			return solve(str, path + "a");
		} else {
			return false;
		}
	}
}
