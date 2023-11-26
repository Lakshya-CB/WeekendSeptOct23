package Lec_09;

public class rotate {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		print(arr);
		rot(arr, 2);
		print(arr);
	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static void rot(int[] arr, int r) {
		r = r % arr.length;
		for (int cnt = 1; cnt <= r; cnt++) {
			int jeb = arr[arr.length - 1];
			for (int R = arr.length - 2; R >= 0; R--) {
				arr[R + 1] = arr[R];
			}
			arr[0] = jeb;
		}
	}
	
}
