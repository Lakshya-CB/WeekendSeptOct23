package Lec_14;

import java.util.Scanner;

public class string_QPS {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//	String str1 = scn.nextLine(); // .next() word
//	String str2 = scn.next();
//	
//	System.out.println(str1 +"////////"+str2);
		String str = "  the  sky  is  blue  ";
//		word_Extract2(str);
		str = "cbaeicde";
		GoodString(str);
	}

	public static void word_Extract(String sen) {
		while (true) {
			int idx = sen.lastIndexOf(" ");
			String word = sen.substring(idx + 1);
			System.out.println(word);
			if (idx == -1) {
				return;
			}
			sen = sen.substring(0, idx);
		}
	}

	public static void word_Extract2(String sen) {
		String[] arr = sen.split(" ");
		for (String str : arr) {
			System.out.println("?" + str + "?");
		}
	}

	public static void GoodString_last(String str) {
		int max_cnt = 0;
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (isVowel(str.charAt(i))) {
				cnt++;
				max_cnt= Math.max(max_cnt, cnt);
			} else {
				cnt = 0;
			}
		}
		System.out.println(max_cnt);
	}

	public static void GoodString(String str) {
		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {
				String ss = str.substring(s, e);
				if (allVow(ss)) {
					System.out.println(ss);
				} else {
					break;
				}
			}
		}
	}

	public static boolean allVow(String ss) {
		for (int i = 0; i < ss.length(); i++) {
			if (false == isVowel(ss.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

}
