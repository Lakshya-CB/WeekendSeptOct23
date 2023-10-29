package Lec_06;

public class Pat_00 {
	public static void main(String[] args) {
		int n = 5;
		int r = 0;
		int cnt_st = 0;
		while (r < n) {
//			int cnt_st = 0;
			while (cnt_st < n) {
				System.out.print("*");
//			cnt_st = cnt_st+1;
				cnt_st++;
			}
			System.out.println();
			r++;
		}
	}
}
