package Lec_DP;

public class Fibo_basic {
	public static void main(String[] args) {
		int n = 50000000;
//		System.out.println(Fibo(n));
//		System.out.println(FiboTopDown(n, new Integer[n + 1]));
		System.out.println(BottomsUp(n));
	}

	public static int Fibo(int n) {
		if (n <= 1) {
			return n;
		}
		int sp1 = Fibo(n - 1);
		int sp2 = Fibo(n - 2);
		return sp1 + sp2;
	}

	public static int FiboTopDown(int n, Integer[] dp) {
		if (n <= 1) {
			return n;
		}
		if (dp[n] != null) {
			return dp[n];
		}
		int sp1 = FiboTopDown(n - 1, dp);
		int sp2 = FiboTopDown(n - 2, dp);
		dp[n] = sp1 + sp2; // stored!!
		return sp1 + sp2;
	}

	public static int BottomsUp(int N) {
		// Step 1) input argument biggest Problem!!
		int[] dp = new int[N + 1];
//		Step 7) Finalize your dp array size!!
		// Step 2) DP array!!!! DO NOT THINK ABOUT THE SIZE!4

//		Step 3) Loop!! smallest to biggest!!
		for (int n = 0; n <= N; n++) {
//			Step 5) Base Case!! base case!! 
//			No index out of bounds!!
			if (n <= 1) {
				dp[n] =  n;
				continue;
			}
//			Step 4) create current solution!!
//			dp[n]!! Fibo(n)!!
			int sp1 = dp[n - 1];
			int sp2 = dp[n - 2];
			dp[n] = sp1 + sp2; // stored!!	
		}
//		Step 6) return biggest problem!!
		return dp[N];

	}
}
