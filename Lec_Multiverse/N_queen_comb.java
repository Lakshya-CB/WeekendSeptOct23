package Lec_Multiverse;

public class N_queen_comb {
	public static void main(String[] args) {
		int N = 4;
		solve(N, N, 0, 0, "", new boolean[N][N]);

	}

	public static void print(boolean[][] board) {
		for (boolean[] row : board) {
			for (boolean b : row) {
				if (b) {
					System.out.print("#");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

	public static void solve(int N, int toPlace, int row, int col, String path, boolean[][] board) {
		if (toPlace == 0) {
			System.out.println(path);
			print(board);
			System.out.println("==============");
			return;
		}

		if (col == N) {
			row++;
			col = 0;
		}
		if (row == N) {
			return;
		}
		if (isSafe(row, col, board)) {
			board[row][col] = true;
			solve(N, toPlace - 1, row, col + 1, path + "Q{" + row + "," + col + "}", board); // inc
			board[row][col] = false;
		}
		solve(N, toPlace, row, col + 1, path, board); // exl

	}

	private static boolean isSafe(int row, int col, boolean[][] board) {
		for (int R = 0; R < row; R++) {
			if (board[R][col]) {
				return false;
			}
		}
		for (int C = 0; C < col; C++) {
			if (board[row][C]) {
				return false;
			}
		}
		int R1 = row;
		int C1 = col;
		while (R1 >= 0 && C1 >= 0) {
			if (board[R1][C1]) {
				return false;
			}
			R1--;
			C1--;
		}
		int R2 = row;
		int C2 = col;
		while (R2 >= 0 && C2 <board[0].length) {
			if (board[R2][C2]) {
				return false;
			}
			R2--;
			C2++;
		}
		return true;
	}
}
