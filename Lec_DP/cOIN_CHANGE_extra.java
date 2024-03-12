package Lec_DP;

import java.util.Arrays;

public class cOIN_CHANGE_extra {
	public static void main(String[] args) {
		int[] coins = { 1, 1, 2, 2, 3 };
		Arrays.sort(coins);
		int A = 4;
//		System.out.println(solve(0, A, coins, "", 1));
//		System.out.println();
		solveU(0, A, "", coins);
	}

//	public static int solve(int idx, int A, int[] coins, String path, int prev, Integer[][][] dp) {
//		if (A == 0) {
//			System.out.println(path);
//			return 1;
//		}
//		if (idx == coins.length || A < 0) {
//			return 0;
//		}
//		if(dp[idx][A][prev]!=null) {
//			return dp[idx][A][prev];
//		}
//		if (prev == 0 && coins[idx] == coins[idx - 1]) {
//			dp[idx][A][prev] = solve(idx + 1, A, coins, path, 0, dp);
//			return dp[idx][A][prev];
//		}
//		int sp1 = solve(idx + 1, A - coins[idx], coins, path + coins[idx], 1, dp);
//		int sp2 = solve(idx + 1, A, coins, path, 0, dp);
//		
//		dp[idx][A][prev] = sp1 + sp2;
//		return dp[idx][A][prev];
//	}
	public static void solveU(int idx, int A, String path, int[] coins) {
		if (A == 0) {
			System.out.println(path);
			return;
		}
		if (A < 0 || idx == coins.length) {
			return;
		}

		for (int i = idx; i < coins.length; i++) {
			if (i == idx || coins[i] != coins[i - 1]) {
				solveU(i + 1, A - coins[i], path + coins[i], coins);
			}
		}
	}
}
