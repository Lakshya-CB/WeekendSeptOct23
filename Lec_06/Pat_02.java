package Lec_06;

public class Pat_02 {
	public static void main(String[] args) {
		int n = 10;
		int row = 1;
		int total_st = 1;
		while (row <= n) {
//			Step 2) work in each row!!
			int cnt_st = 0;
			while (cnt_st < total_st) {
				System.out.print("* ");

				cnt_st++;
			}

//			Prep for the next row!!
			total_st++;
			row++;
			System.out.println();
		}
	}
}
