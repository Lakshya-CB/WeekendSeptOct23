package Lec_11;

import java.util.Arrays;

public class soooritn_ins {
	public static void main(String[] args) {
		int[] arr = { 50,40,30,20,10 };
		System.out.println(Arrays.toString(arr));
		Insertion(arr);

	}

	public static void Insertion(int[] arr) {
//	arr = {10,20,30,40,15}
		for (int last_idx = 1; last_idx < arr.length; last_idx++) {
			int ali = arr[last_idx];
			int idx = last_idx - 1;
			while (idx >= 0 && arr[idx] > ali) {
				arr[idx + 1] = arr[idx];
				idx--;
			}
			arr[idx + 1] = ali;
			System.out.println(Arrays.toString(arr));

		}
	}
}
