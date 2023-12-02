package Lec_10;

import java.util.Arrays;

public class soooorting {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 30, 20, 10 };
		System.out.println(Arrays.toString(arr));
		bubble(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void bubble(int[] arr) {
		for (int cnt = 1; cnt < arr.length; cnt++) {
			for (int s = 0; s <= arr.length - 2; s++) {
				if (arr[s] > arr[s + 1]) {
					int temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
			}
		}
	}

	public static void selection(int[] arr) {
		for (int l = arr.length - 1; l >= 1; l--) {
			int max_idx = 0;
			for (int i = 0; i <= l; i++) {
				if (arr[max_idx] < arr[i]) {
					max_idx = i;
				}
			}
//		chwaap!!
			int temp = arr[l];
			arr[l] = arr[max_idx];
			arr[max_idx] = temp;
		}
	}
}
