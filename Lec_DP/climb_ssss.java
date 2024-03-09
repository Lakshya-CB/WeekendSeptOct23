package Lec_DP;

public class climb_ssss {
	static int solve = 0;

	public static void main(String[] args) {
		int n = 3;
		System.out.println(chad(0, n, new Integer[n+1] ));
	}

	public static int chad(int curr, int dest, Integer[] dp) {
		if (curr == dest) {

			return 1;
		}
		if (curr > dest) {
			return 0;
		}
		if(dp[curr]!=null) {
			return dp[curr];
		}
		int sp1 = chad(curr + 1, dest, dp);
		int sp2 = chad(curr + 2, dest, dp);
		dp[curr] = sp1 + sp2;
		return sp1 + sp2;
	}
	public static int BU(int dest) {
		int[] dp = new int[dest+2];
		for(int curr = dest;curr>=0;curr--) {
//			dp[curr]!
			if (curr == dest) {
				dp[curr]= 1;
				continue;
			}
			if (curr > dest) {
				return 0;
			}
			int sp1 = dp[curr + 1];
			int sp2 = dp[curr + 2];
			dp[curr] = sp1 + sp2;
		}
		return dp[0];
	}
}
