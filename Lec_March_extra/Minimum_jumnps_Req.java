package Lec_March_extra;

import java.util.Scanner;

public class Minimum_jumnps_Req {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int[] arr = new int[scn.nextInt()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();

			}
			System.out.println(solve(0, arr));
			t--;
		}

	}

	public static int solve(int curr, int[] arr) {
		if (curr >= arr.length - 1) {
			return 0;
		} 
		int ans = Integer.MAX_VALUE;
		for (int jump = 1; jump <= arr[curr]; jump++) {
			int sp1 = 1 + solve(curr + jump, arr);
			ans = Math.min(ans, sp1);
		}
		return ans;
	}
	
}
