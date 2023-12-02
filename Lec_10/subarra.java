package Lec_10;

public class subarra {
	public static void main(String[] args) {
		int[] arr = { 10, 20, -99, 30, -10, 40 };
		printAllSS2(arr);
	}

	public static void printAllSS(int[] arr) {
		for (int s = 0; s < arr.length; s++) {
			for (int e = s; e < arr.length; e++) {
//				System.out.println(s + " - " + e);
				int sum = 0;
				for (int i = s; i <= e; i++) {
					sum = sum + arr[i];
					System.out.print(arr[i] + " ");
				}
				System.out.println("=>" + sum);
			}
		}
	}

	public static void printAllSS2(int[] arr) {

//		int sum = 0; // a
		for (int s = 0; s < arr.length; s++) {

			int sum = 0; // B
			for (int e = s; e < arr.length; e++) {

//				int sum = 0; // c
				sum = sum + arr[e];
				System.out.println("=>" + sum);
			}
		}
	}

	public static int Kadance(int[] arr) {
//		max sumarray sum!!
		int sum = 0;
		int max_ans = arr[0];
		for (int ali : arr) {
			sum = sum + ali;
			if(sum > max_ans) {
				max_ans = sum;
			}
			if(sum<0) {
				sum = 0;
			}
		}
		return;
	}
}
