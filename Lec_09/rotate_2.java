package Lec_09;

public class rotate_2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		solve(arr, 8);
	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static void solve(int[] arr, int r) {
		r = r % arr.length;
//		Step 1)!!
		rev(arr, 0, arr.length - 1);
		print(arr);

//		Step 2) last r elements aage agye!!
		rev(arr, 0, r - 1);
		print(arr);

//		Step 3)
		rev(arr, r, arr.length - 1);
		print(arr);

	}

	public static void rev(int[] arr, int L, int R) {
		while (L < R) {
//		L and R chwaap!!
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
			L++;
			R--;
		}
	}
}
