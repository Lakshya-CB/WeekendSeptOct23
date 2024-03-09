package Lec_DP;

public class House_robber {
	public static void main(String[] args) {
		int[] arr = { 5, 100, 6, 2, 4, 100, 4 };
		System.out.println(daketiTD(0, arr, new Integer[arr.length]));
	}

	public static int daketiTD(int idx, int[] arr, Integer[] dp) {
		if (idx >= arr.length) {
			return 0;
		}
		if(dp[idx]!=null) {
			return dp[idx];
		}
		int sp1 = arr[idx] + daketiTD(idx + 2, arr, dp);
		int sp2 = daketiTD(idx + 1, arr, dp);
		dp[idx] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}
	public static int BU(int [] houses) {
		int[] dp = new int[houses.length+2];
		for(int idx = houses.length-1;idx>=0;idx--) {
//			dp[idx]!!
			int sp1 = houses[idx] + dp[idx + 2];
			int sp2 = dp[idx + 1];
			dp[idx] = Math.max(sp1, sp2);
		}
		return dp[0];
	}
}
