package Lec_HM_Graph_Big;

public class Palin {

	public static void main(String[] args) {
		String str = "bbcdc";
		System.out.println(solve(str, ""));
	}

	public static int solve(String str, String bag) {
		if (str.isEmpty()) {
			System.out.println(bag);
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		for (int chakku = 1; chakku <= str.length(); chakku++) {
			String piece = str.substring(0, chakku);
			if (Palin(piece)) {
				String remain = str.substring(chakku);
				int sp1 = 1 + solve(remain, bag + piece + "||");
				ans = Math.min(ans, sp1);
			}
		}
		return ans;
	}

	public static boolean Palin(String str) {
		int s = 0;
		int e = str.length() - 1;
		while (s < e) {
			if (str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
}
