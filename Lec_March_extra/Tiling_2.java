package Lec_March_extra;

import java.util.Scanner;

public class Tiling_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int  t= scn.nextInt();
		while(t>0) {
			int  n= scn.nextInt();
			int  m= scn.nextInt();
			System.out.println(solve(n, m, m));
		}
	}

	public static int solve(int n, int m, int tile_m) {
//		tile is 1xm!!
		if (n == 0 && m == 0) {
			return 1;
		}
		if (n < 0 || m < 0) {
			return 0;
		}
		int sp1 = solve(n - 1, m, tile_m);
		int sp2 = solve(n, m - 1, tile_m);
		return sp1 + sp2;

	}

}
