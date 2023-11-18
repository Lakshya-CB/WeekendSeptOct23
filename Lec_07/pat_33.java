package Lec_07;

public class pat_33 {
	public static void main(String[] args) {
		int n = 10;
		int r = 1;
		int total_sp = n - 1;
		int total_st = 1;
		int startingNum = n;
		while (r <= n) {
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			int num = startingNum;
			int cnt_st = 0;
			while (cnt_st < total_st) {
				System.out.print(num%10 + " ");
				
				if (cnt_st < total_st / 2) {
					num++;
				} else {
					num--;
				}
				cnt_st++;

			}

			total_sp--;
			total_st = total_st + 2;
			r++;
			startingNum--;
			System.out.println();
		}
	}
}
