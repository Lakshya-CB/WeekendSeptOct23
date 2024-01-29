package Lec_20;

public class blocked_maze {
	public static void main(String[] args) {
		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		solve(0, 0, "", maze,new boolean[maze.length][maze[0].length]);
	}

	public static void solve(int r, int c, String path, int[][] maze,boolean[][] isVisited) {
		if (r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(path);
			return;
		}
		if (r < 0 || c < 0 || r == maze.length || c == maze[0].length || maze[r][c]==1 ||isVisited[r][c]) {
			return;
		}
		isVisited[r][c] = true;
		solve(r - 1, c, path + "U", maze,isVisited);
		solve(r + 1, c, path + "D", maze,isVisited);
		solve(r, c - 1, path + "L", maze,isVisited);
		solve(r, c + 1, path + "R", maze,isVisited);
		isVisited[r][c] = false;
	}

}
