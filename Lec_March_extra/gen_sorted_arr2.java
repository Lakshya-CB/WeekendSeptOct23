package Lec_March_extra;

import java.util.Scanner;

public class gen_sorted_arr2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr1 = new int[scn.nextInt()];
		int[] arr2 = new int[scn.nextInt()];
		for (int idx1 = 0; idx1 < arr1.length; idx1++) {
			arr1[idx1] = scn.nextInt();
		}
		for (int idx2 = 0; idx2 < arr2.length; idx2++) {
			arr2[idx2] = scn.nextInt();
		}
		solve(true, -1, -1, arr1, arr2, "", Integer.MIN_VALUE);

	}

	public static void solve(boolean A, int idx1, int idx2, int[] arr1, int[] arr2, String path, int prev) {

		if (A) {
			if (path.length() > 0) {

				System.out.println(path);
			}
			for (int i = idx1 + 1; i < arr1.length; i++) {
				if (arr1[i] > prev) {
					solve(false, i, idx2, arr1, arr2, 
							path + arr1[i] + " ", arr1[i]);
				}
			}
		} else {
			for (int i = idx2 + 1; i < arr2.length; i++) {
				if (arr2[i] > prev) {
					solve(true, idx1, i, arr1, arr2,
							path + arr2[i] + " ", arr2[i]);
				}
			}
		}

	}
}
