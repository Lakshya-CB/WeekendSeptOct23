package Lec_March_extra;

import java.util.Scanner;

public class gen_sorted {
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
		play(true, 0, 0, "", arr1, arr2, Integer.MIN_VALUE);

	}

	public static void play(boolean A, int idx1, int idx2, String path, int[] arr1, int[] arr2, int prev) {

//		System.out.println(path);

		if (A) {
			if (idx1 == arr1.length) {
				System.out.println(path+"??");
				return;
			}
			if (arr1[idx1] > prev) {
				play(false, idx1 + 1, idx2, path + arr1[idx1] + " ", arr1, arr2, arr1[idx1]);
			}
			play(true, idx1 + 1, idx2, path, arr1, arr2, prev);
		} else {
			if (idx2 == arr2.length) {
//				System.out.println(path);
				return;
			}
//			A = > false
			if (arr2[idx2] > prev) {
				play(true, idx1, idx2 + 1, path + arr2[idx2] + " ", arr1, arr2, arr2[idx2]);
			}
			play(false, idx1, idx2 + 1, path, arr1, arr2, prev);

		}

	}
}
