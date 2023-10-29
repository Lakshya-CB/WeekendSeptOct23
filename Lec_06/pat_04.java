package Lec_06;

public class pat_04 {
	public static void main(String[] args) {
		int n = 10;
		int row = 1;
		int total_st = 1;
		int total_sp = n-1;
		while (row <= n) {
//			space !!
			int cnt_sp =0;
			while(cnt_sp<total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
//			Star!!
			int cnt_st =0;
			while(cnt_st<total_st) {
				System.out.print("* ");
				cnt_st++;
			}
			row++;
			total_sp--;
			total_st++;
			System.out.println();
		}
	}
}
