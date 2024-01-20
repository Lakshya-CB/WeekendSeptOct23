package Lec_Rec_1;

public class Rec_array {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
//		print(0, arr);
//		revPrint(0, arr);
		print_2(0, arr.length-1, arr);
	}
	public static void print(int s, int e, int[] arr) {
		if (s == arr.length) {
			return;
		}
//		BP : (0,arr.len-1,arr)
//		SP : (1,n-1,arr)
		System.out.println(arr[s]);
		print(s + 1, e, arr);

	}

	public static void print(int s, int[] arr) {
		if (s == arr.length) {
			return;
		}
//		BP : (0,arr.len-1,arr)
//		SP : (1,n-1,arr)
		System.out.println(arr[s]);
		print(s + 1, arr);

	}

	public static void revPrint(int s, int[] arr) {
		if (s == arr.length) {
			return;
		}
		revPrint(s + 1, arr);
		System.out.println(arr[s]);
	}

	public static void print_2(int s, int e, int[] arr) {
		if(s>e) {
			return;
		}
		int mid = (s + e) / 2;
		print_2(s, mid - 1, arr);
		System.out.println(arr[mid]);
		print_2(mid + 1, e, arr);
	}
}
