package Lec_13;

public class array_2d_qps {
	public static void main(String[] args) {
		int[][] arr = { { 41, 42, 43, 44, 45 } };
//		wavey(arr);
		spiral(arr);
	}

	public static void wavey(int[][] arr) {
		for (int c = 0; c < arr[0].length; c++) {
			if (c % 2 == 0) {
				for (int r = 0; r < arr.length; r++) {
					System.out.print(arr[r][c] + " ");
				}
			} else {
				for (int r = arr.length - 1; r >= 0; r--) {
					System.out.print(arr[r][c] + " ");
				}
			}
//			System.out.println();
		}
	}

	public static void spiral(int[][] arr) {
		int rs = 0;
		int cs = 0;
		int re = arr.length - 1;
		int ce = arr[0].length - 1;
		while (rs <= re && cs <= ce) {
			for (int r = rs; r <= re; r++) {
				System.out.print(arr[r][cs] + " ");
			}
			System.out.println();
			for (int c = cs + 1; c <= ce; c++) {
				System.out.print(arr[re][c] + " ");
			}
			System.out.println();

			for (int r = re - 1; cs != ce && r >= rs; r--) {
				System.out.print(arr[r][ce] + " ");
			}
			System.out.println();

			for (int c = ce - 1; rs != re && c >= cs + 1; c--) {
				System.out.print(arr[rs][c] + " ");
			}
			System.out.println();
			rs++;
			cs++;
			re--;
			ce--;
		}
	}

	public static void spiral2(int[][] arr) {
		int rs = 0;
		int cs = 0;
		int re = arr.length - 1;
		int ce = arr[0].length - 1;
		int cnt = 0;
		int tt = arr.length * arr[0].length;
		while (rs <= re && cs <= ce) {
			for (int r = rs; r <= re && cnt < tt; r++) {
				System.out.print(arr[r][cs] + " ");
				cnt++;
			}
			System.out.println();
			for (int c = cs + 1; c <= ce && cnt < tt; c++) {
				System.out.print(arr[re][c] + " ");
				cnt++;
			}
			System.out.println();

			for (int r = re - 1; r >= rs && cnt < tt; r--) {
				System.out.print(arr[r][ce] + " ");
				cnt++;
			}
			System.out.println();

			for (int c = ce - 1; c >= cs + 1 && cnt < tt; c--) {
				System.out.print(arr[rs][c] + " ");
				cnt++;
			}
			System.out.println();
			rs++;
			cs++;
			re--;
			ce--;
		}
	}
	public static boolean find(int[][] arr,int ali) {
		int r = 0;
		int c = arr.length-1;
		while(c>=0 && r<arr.length) {
			if(arr[r][c]==ali) {
				return true;
			}else if(arr[r][c]>ali) {
				c--;
			}else {
				r++;
			}
		}
		return false;
	}
}
