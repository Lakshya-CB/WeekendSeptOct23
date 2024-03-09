package Lec_DP;

import java.util.Arrays;

public class cOIN_CHANGE_extra {
	public static void main(String[] args) {
		int[] coins = { 1, 1, 2, 2, 3 };
		Arrays.sort(coins);
		int A = 4;
		System.out.println(solve(0, A, coins, "", 1));

	}

	public static int solve(int idx, int A, int[] coins, String path, int prev) {
		if (A == 0) {
			System.out.println(path);
			return 1;
		}
		if (idx == coins.length || A < 0) {
			return 0;
		}
		if (prev == 0 && coins[idx] == coins[idx - 1]) {
			return solve(idx + 1, A, coins, path, 0);
		}
		int sp1 = solve(idx + 1, A - coins[idx], coins, path + coins[idx], 1);
		int sp2 = solve(idx + 1, A, coins, path, 0);
		return sp1 + sp2;
	}
}
