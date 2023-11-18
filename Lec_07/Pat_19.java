package Lec_07;

public class Pat_19 {
	public static void main(String[] args) {
		int n = 17;
		int r = 1;
		int total_sp = -1;
		int total_st = n / 2 + 1;
		while (r <= n) {
			int cnt_st1 = 0;
			while (cnt_st1 < total_st) {
				System.out.print("* ");
				cnt_st1++;
			}

			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}

			int cnt_st2 = 0;
			if (r == 1 || r == n) {
				cnt_st2 = 1;
			}
			while (cnt_st2 < total_st) {
				System.out.print("* ");
				cnt_st2++;
			}

			System.out.println();
			r++;
			if (r <= n / 2 + 1) {
				total_sp = total_sp + 2;
				total_st--;
			} else {
				total_sp = total_sp - 2;
				total_st++;
			}
		}
	}
}
