package Lec_07;

public class Pat_32 {
	public static void main(String[] args) {
		int n = 5;
		int r = 1;
		int total_st = 1;
		int num = 1;
		while (r <= 2 * n - 1) {
			int cnt_st = 0;
			while (cnt_st < total_st) {
				if (cnt_st % 2 == 0) {
					System.out.print(num + " ");

				} else {
					System.out.print("* ");
				}
				cnt_st++;
			}

			r++;
			if (r <= n) {
				total_st = total_st + 2;
				num++;
			} else {
				total_st = total_st - 2;
				num--;
			}
			System.out.println();

		}
	}
}
