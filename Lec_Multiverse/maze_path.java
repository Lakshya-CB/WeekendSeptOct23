package Lec_Multiverse;

public class maze_path {
	public static void main(String[] args) {
		chal(0, 0, "", 2, 2);
	}

	public static void chal(int r, int c, String path, 
			int dest_r, int dest_c) {
		if(r==dest_r && c==dest_c) {
			System.out.println(path);
			return;
		}
		if(r>dest_r|| c>dest_c) { //-ve BC
			return;
		}
		chal(r + 1, c, path + "D",dest_r,dest_c);
		chal(r, c + 1, path + "R",dest_r,dest_c);
	}
}
