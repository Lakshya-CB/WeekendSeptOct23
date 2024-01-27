package Lec_Multiverse;

public class Comb {
	public static void main(String[] args) {
		int n = 3;
		int r = 2;
//		wrtPT(n, r, -1, "");
		wrtSeat(n, r, 0, "");
	}

	public static void wrtPT(int total, int r, int prev, String path) {

		if (r == 0) {
			System.out.println(path);
			return;
		}
		for (int box_idx = prev + 1; box_idx < total; box_idx++) {
//			box_idx =2
			wrtPT(total, r - 1, box_idx, path + "b" + box_idx);
		}
	}

	public static void wrtSeat(int total, int r, 
			int curr, String path) {
		if(r==0) {
			System.out.println(path);
			return;
			
		}
		if(curr==total) {
			return;
		}
		
		wrtSeat(total, r-1, curr + 1, path+"b"+curr);
		wrtSeat(total, r, curr + 1, path);

	}
}
