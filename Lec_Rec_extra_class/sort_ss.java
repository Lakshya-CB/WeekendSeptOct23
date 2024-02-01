package Lec_Rec_extra_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sort_ss {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			t--;
			ArrayList<String> AL = new ArrayList<>();
			solve(scn.next(), "", AL);
			Collections.sort(AL);
//			System.out.println(AL);
			for(String ss : AL) {
				System.out.println(ss);
			}
		}
	}

	public static void solve(String str, String path, ArrayList<String> AL) {
		if (str.isEmpty()) {
//			System.out.println(path);
			AL.add(path);
			return;
		}
		String remain = str.substring(1);
		char ch = str.charAt(0);
		solve(remain, path + ch, AL);
		solve(remain, path, AL);
	}
}
