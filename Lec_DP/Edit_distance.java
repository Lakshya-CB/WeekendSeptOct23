package Lec_DP;

public class Edit_distance {
	public static void main(String[] args) {
		System.out.println(solve(0, 0, "horse", "ros"));
	}

	public static int solve(int idx1, int idx2, String str1, String str2) {

		if (idx1 == str1.length()) {
			return str2.length() - idx2;
		}
		if (idx2 == str2.length()) {
			return str1.length() - idx1;
		}
		if (str1.charAt(idx1) == str2.charAt(idx2)) {
			return solve(idx1 + 1, idx2 + 1, str1, str2);
		} else {
			int D = solve(idx1 + 1, idx2, str1, str2);
			int R = solve(idx1 + 1, idx2 + 1, str1, str2);
			int I = solve(idx1, idx2 + 1, str1, str2);
			return 1 + Math.min(R, Math.min(D, I));
		}
	}

	public static int BU(String str1, String str2) {
		int[][] dp = new int[str1.length() + 1][str2.length() + 1];
		for (int idx1 = str1.length(); idx1 >= 0; idx1--) {
			for (int idx2 = str2.length(); idx2 >= 0; idx2--) {

				if (idx1 == str1.length()) {
					dp[idx1][idx2] = str2.length() - idx2;
					continue;
				}
				if (idx2 == str2.length()) {
					dp[idx1][idx2] = str1.length() - idx1;
					continue;
				}
				if (str1.charAt(idx1) == str2.charAt(idx2)) {
					dp[idx1][idx2] = dp[idx1 + 1][idx2 + 1];
					continue;
				} else {
					int D = dp[idx1 + 1][ idx2];
					int R = dp[idx1 + 1][ idx2 + 1];
					int I = dp[idx1][idx2 + 1];
					dp[idx1][idx2] = 1 + Math.min(R, Math.min(D, I));
					continue;
				}
			}
		}
		return dp[0][0];
	}
}
