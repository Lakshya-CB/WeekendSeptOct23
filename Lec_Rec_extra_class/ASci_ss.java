package Lec_Rec_extra_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ASci_ss {
	static int global = 0;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		ArrayList<String> AL = new ArrayList<>();
		solve(scn.next(), "", AL);
//		for (String ss : AL) {
//			System.out.print(ss+" ");
//		}
		System.out.println();
		System.out.println(global);

	}

	public static void solve(String str, String path, ArrayList<String> AL) {
		if (str.isEmpty()) {
			global++;
			System.out.print(path+" ");
//			AL.add(path);
			return;
		}
		String remain = str.substring(1);
		char ch = str.charAt(0);
		solve(remain, path, AL);
		solve(remain, path + ch, AL);
		solve(remain, path + (int) ch, AL);

	}
}
