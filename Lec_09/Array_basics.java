package Lec_09;

public class Array_basics {
	public static void main(String[] args) {
//		int[] arr = { 2, 5, 1, 4, 10, 5, 5, 5, 9, 8 };
		int[] arr = new int[] { 10, 20, 30, 40, 50 };
//		System.out.println(find(arr, 5));
		print(arr);
		rev2(arr);
		print(arr);
	}

	public static void rev(int[] arr) {
		int L = 0;
		int R = arr.length - 1;
		while (L < R) {
//			L and R chwaap!!
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
			L++;
			R--;
		}
	}
	public static void rev2(int[] arr) {
		int L = 0;
		int R = arr.length - 1;
		while (L < arr.length) {
//			L and R chwaap!!
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
			L++;
			R--;
		}
	}
	public static int find(int[] arr, int ali) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ali) {
				return i;
			}
		}
		return -1;
	}

	public static int max(int[] boori) {
		int jeb = Integer.MIN_VALUE;
		for (int aam : boori) {
			if (aam > jeb) {
				jeb = aam;
			}
		}
		return jeb;
	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static void printRev(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
