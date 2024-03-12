package Lec_March_extra;

public class minimal {
	public static void main(String[] args) {
//		System.out.println();
	}

	public static int solve(int s, int e, int k) {
		if (k == 1) {
			return e - s + 1;
		}
		if (s > e) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		for (int c = s; c <= e; c++) {
			int sp1 = solve(s, c - 1, k - 1);
			int sp2 = solve(c + 1, e, k);
			int curr = 1 + Math.max(sp1, sp2);
			ans = Math.min(ans, curr);
		}
		return ans;
	}
}
