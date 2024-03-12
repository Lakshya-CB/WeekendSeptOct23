package Lec_DP;

import java.util.ArrayList;


public class LIS {
	public static void main(String[] args) {
		int[] arr =  {10, 12, 9, 2, 5, 3, 11, 7, 1, 101};
//		System.out.println(solve(0, -1, arr));
//		System.out.println();
		BS(arr);
	}

	public static int solve(int idx, int prev_idx, int[] arr) {
//		 solve(idx,pi)=> dp[idx][pi+1]
		if (idx == arr.length) {
			return 0;
		}
		int sp1 = 0;
		if (prev_idx == -1 || arr[idx] > arr[prev_idx]) {
			sp1 = 1 + solve(idx + 1, idx, arr);
		}
		int sp2 = solve(idx + 1, prev_idx, arr);
		return Math.max(sp1, sp2);
	}

	public static int solveTD(int idx, int prev_idx, int[] arr, Integer[][] dp) {
//		 solve(idx,pi)=> dp[idx][pi+1]
		if (idx == arr.length) {
			return 0;
		}
		if (dp[idx][prev_idx + 1] != null) {
			return dp[idx][prev_idx + 1];
		}
		int sp1 = 0;
		if (prev_idx == -1 || arr[idx] > arr[prev_idx]) {
			sp1 = 1 + solveTD(idx + 1, idx, arr, dp);
		}
		int sp2 = solveTD(idx + 1, prev_idx, arr, dp);
		dp[idx][prev_idx + 1] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}

	public static int BU(int[] arr) {
		int[][] dp = new int[arr.length + 10][arr.length + 10];
		for (int idx = arr.length - 1; idx >= 0; idx--) {
			for (int prev_idx = arr.length - 1; prev_idx >= -1; prev_idx--) {
//				solve(idx,prev_idx)!!
				if (idx == arr.length) {
					dp[idx][prev_idx + 1] = 0;
					continue;
				}

				int sp1 = 0;
				if (prev_idx == -1 || arr[idx] > arr[prev_idx]) {
					sp1 = 1 + dp[idx + 1][idx + 1];
				}
				int sp2 = dp[idx + 1][prev_idx + 1];
				dp[idx][prev_idx + 1] = Math.max(sp1, sp2);
			}
		}
		return dp[0][-1 + 1];
	}

//	nlogn approach!!
	public static int BS(int[] arr) {
//		 { 10, 12, 9, 2, 5, 3, 11, 7, 1, 101};
		ArrayList<Integer> AL = new ArrayList<>();
//		AL = {5,7,10,12,15,24,100}

		for (int ali : arr) {
			if (AL.isEmpty() || AL.get(AL.size() - 1) < ali) {
				AL.add(ali);
			} else {
				int s = 0;
				int e = AL.size() - 1;
				int f = -1;
				while (s <= e) {
					int mid = (s + e) / 2;
					if (ali <= AL.get(mid)) {
						f = mid;
						e = mid - 1;
					} else {
						s = mid + 1;
					}
				}
				AL.set(f, ali);
			}
			System.out.println(AL);
		}
		return AL.size();
	}
}
